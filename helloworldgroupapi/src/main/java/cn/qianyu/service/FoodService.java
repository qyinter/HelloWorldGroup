package cn.qianyu.service;

import cn.qianyu.domain.Admin;
import cn.qianyu.domain.Food;
import cn.qianyu.domain.PageBean;
import cn.qianyu.mapper.FoodMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class FoodService {
    @Autowired
    private FoodMapper foodMapper;

    public List<Food> findAll(){
        List<Food> foods = foodMapper.selectAll();
        return foods;
    }

    public List<Food> findByName(String name) {

        List<Food> foods = foodMapper.findByName(name);
        return foods;
    }

    public PageBean<Food> pageQuery(int currentPage, int pageSize) {
        PageBean<Food> pb = new PageBean<>();
        pb.setCurrentPage(currentPage);
        pb.setPageSize(pageSize);
        int totalCount = foodMapper.findTotalCountAll();
        pb.setTotalCount(totalCount);
        int start = (currentPage - 1) * pageSize;
        pb.setStart(start);
        List<Food> foodList = foodMapper.findByPage(pb);
        pb.setList(foodList);
        int totalPage = totalCount % pageSize == 0 ? totalCount / pageSize : (totalCount / pageSize) + 1;
        pb.setTotalPage(totalPage);
        return pb;
    }

    public Food findByRid(String rid){
        Food food = foodMapper.findByRid(rid);
        return food;
    }

    public boolean login(Admin admin) {
        Admin adm= foodMapper.login(admin);
        if(adm!=null){
            return true;
        }
        return false;
    }

    public void addFood(Food food){
        foodMapper.addFood(food);
    }

    public void deleteFood(Integer rid) {
        foodMapper.deleteFood(rid);
    }

    public void updateFood(Food food) {
        foodMapper.updateFood(food);
    }
}

package cn.qianyu.web;

import cn.qianyu.domain.Food;
import cn.qianyu.domain.PageBean;
import cn.qianyu.service.FoodService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Slf4j
@Controller
@RequestMapping("food")
public class ApiController {
    @Autowired
    private FoodService foodService;

    @RequestMapping("findAll")
    @ResponseBody
    public List<Food> findAll(){
        List<Food> all = foodService.findAll();
        return all;
    }

    @RequestMapping("/findByName")
    @ResponseBody
    public List<Food> findByName(@Param("name") String name){
        List<Food> foods = foodService.findByName(name);
        return foods;
    }

    @RequestMapping("/pageQuery")
    @ResponseBody
    public PageBean<Food> pageQuery(@Param("page")int currentPage, @Param("size")int pageSize){
        if (currentPage==0){
            currentPage=1;
        }
        if (pageSize==0){
            pageSize = 5;
        }
        PageBean<Food> foodPageBean = foodService.pageQuery(currentPage, pageSize);
        return foodPageBean;
    }

    @RequestMapping("/findByRid")
    @ResponseBody
    public Food findByRid(@Param("rid") String rid){
        Food food = foodService.findByRid(rid);
        return food;
    }
}

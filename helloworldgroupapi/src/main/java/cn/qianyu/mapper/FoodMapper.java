package cn.qianyu.mapper;


import cn.qianyu.domain.Food;
import cn.qianyu.domain.PageBean;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface FoodMapper extends Mapper<Food> {
    //搜索框搜索文本
    @Select("select * from hello_food WHERE food_name LIKE '%${value}%' or food_material  LIKE '%${value}%' or food_details  LIKE '%${value}%' or food_address LIKE '%${value}%'")
    List<Food> findByName(String name);

    //查询总记录数
    @Select("select count(*) from hello_food where cid = #{cid}")
    int findTotalCountAll();

    //分页全部
    @Select("select * from hello_food limit #{start},#{pageSize}")
    List<Food> findByPage(PageBean<Food> pageBean);

    //根据rid查询单个食物
    @Select("select * from hello_food where rid = #{rid}")
    Food findByRid(String rid);
}

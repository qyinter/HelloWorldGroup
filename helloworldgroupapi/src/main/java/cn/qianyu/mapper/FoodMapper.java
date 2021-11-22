package cn.qianyu.mapper;


import cn.qianyu.domain.Admin;
import cn.qianyu.domain.Food;
import cn.qianyu.domain.PageBean;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface FoodMapper extends Mapper<Food> {

    @Select("select * from hello_food WHERE food_name LIKE '%${value}%' or food_material  LIKE '%${value}%' or food_details  LIKE '%${value}%' or food_address LIKE '%${value}%'")
    List<Food> findByName(String name);


    @Select("select count(*) from hello_food")
    int findTotalCountAll();


    @Select("select * from hello_food limit #{start},#{pageSize}")
    List<Food> findByPage(PageBean<Food> pageBean);


    @Select("select * from hello_food where rid = #{rid}")
    Food findByRid(String rid);

    @Select("select * from hello_admin where username = #{username} and password = #{password}")
    Admin login(Admin admin);

    @Insert("insert into hello_food(food_name,food_details,food_address,small_imgs,big_imgs,making_method,food_material,cid,time,energy,media) values(#{food_name},#{food_details},#{food_address},#{small_imgs},#{big_imgs},#{making_method},#{food_material},#{cid},#{time},#{energy},#{media})")
    void addFood(Food food);

    @Delete("delete from hello_food where rid = #{rid}")
    void deleteFood(Integer rid);

    @Update("update hello_food set food_name = #{food_name},food_details = #{food_details},food_address = #{food_address},small_imgs = #{small_imgs},big_imgs = #{big_imgs},making_method = #{making_method},food_material = #{food_material},cid = #{cid},time = #{time},energy = #{energy},media = #{media} where rid = ${rid}")
    void updateFood(Food food);
}

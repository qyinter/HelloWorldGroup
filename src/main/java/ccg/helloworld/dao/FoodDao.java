package ccg.helloworld.dao;

import ccg.helloworld.domain.Food;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 食物的接口
 */
public interface FoodDao {
    /**
     * 查询所有食物的方法
     * @return
     */
    @Select("select * from hello_food")
    List<Food> findAll();

    /**
     * 测试保存食物的方法
     * @param food
     */
    @Insert("insert into hello_food(" +
            "food_name," +
            "food_details," +
            "food_address," +
            "small_imgs," +
            "big_imgs," +
            "making_method," +
            "food_material," +
            "cid," +
            "time," +
            "energy," +
            "salt) " +
            " values(" +
            "#{food_name}," +
            "#{food_details}," +
            "#{food_address}," +
            "#{small_imgs}," +
            "#{big_imgs}," +
            "#{making_method}," +
            "#{food_material}," +
            "#{cid},#{time}," +
            "#{energy}," +
            "#{salt})")
    void saveFoot(Food food);
}

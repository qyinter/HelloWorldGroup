package ccg.helloworld.service;

import ccg.helloworld.domain.Food;

import java.util.List;

public interface FoodService {
    /**
     * 查询所有食物的方法
     * @return
     */
    List<Food> findAll();

    /**
     * 测试保存食物的方法
     * @param food
     */
    void saveFoot(Food food);
}

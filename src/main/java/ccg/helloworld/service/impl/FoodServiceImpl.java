package ccg.helloworld.service.impl;

import ccg.helloworld.domain.Food;
import ccg.helloworld.service.FoodService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("foodService")
public class FoodServiceImpl implements FoodService {


    public List<Food> findAll() {
        System.out.println("业务层查询所有食物");
        return null;
    }


    public void saveFoot(Food food) {
        System.out.println("业务层保存食物");

    }

}

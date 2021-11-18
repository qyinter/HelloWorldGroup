package cn.qianyu.mapper;

import cn.qianyu.domain.Food;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FoodMapperTest {
    @Autowired
    private FoodMapper foodMapper;

    @Test
    public void testUserMapper(){
        List<Food> foods = foodMapper.selectAll();
        System.out.println(foods);
    }
    @Test
    public void testSearch(){
        List<Food> foods = foodMapper.findByName("カレ");
        System.out.println(foods);
    }
}
package ccg.helloworld.test;

import ccg.helloworld.service.FoodService;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring_test {

    @Test
    public void test_FoodService(){
        //1.加载配置
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //2.获取对象
        FoodService service = ac.getBean("foodService", FoodService.class);
        //3.调用
        service.findAll();
    }
}

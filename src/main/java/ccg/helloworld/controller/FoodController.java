package ccg.helloworld.controller;

import ccg.helloworld.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 食物前端控制器
 */
@Controller
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @RequestMapping("/findAll")
    public String findAll(){
        //调用service
        foodService.findAll();
        System.out.println("前端控制器ok了....");
        return "success";
    }
}

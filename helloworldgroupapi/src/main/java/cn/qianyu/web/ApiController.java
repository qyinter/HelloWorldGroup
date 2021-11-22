package cn.qianyu.web;

import cn.qianyu.domain.Admin;
import cn.qianyu.domain.Food;
import cn.qianyu.domain.Message;
import cn.qianyu.domain.PageBean;
import cn.qianyu.service.FoodService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Slf4j
@Controller
@RequestMapping("/food")
public class ApiController {
    @Autowired
    private FoodService foodService;

    @RequestMapping("/findAll")
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
    public PageBean<Food> pageQuery(@Param("currentPage")int currentPage, @Param("pageSize")int pageSize){

        if (currentPage==0){
            currentPage=1;
        }
        if (pageSize==0){
            pageSize = 9;
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

    @RequestMapping("/login")
    @ResponseBody
    public Message login(Admin admin, HttpServletRequest request){

        boolean flag = foodService.login(admin);

        Message message = new Message();
        if (flag){
            message.setCode(200);
            message.setMsg("ログイン成功！");
            request.getSession().setAttribute("admin",admin);
            return message;
        }
        message.setCode(100);
        message.setMsg("ログインエラー！");
        return message;
    }

    @RequestMapping("/addFood")
    @ResponseBody
    public Message addFood(Food food){
        Message message = new Message();
        foodService.addFood(food);
        message.setCode(200);
        message.setMsg("ログイン成功！");
        return message;
    }

    @RequestMapping("/deleteFood")
    @ResponseBody
    public String deleteFood(@Param("rid") Integer rid){
        foodService.deleteFood(rid);
        return "success";
    }
    @RequestMapping("/updateFood")
    @ResponseBody
    public String updateFood(Food food){
        foodService.updateFood(food);
        return "success";
    }
}

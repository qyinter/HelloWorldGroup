package cn.qianyu.interceptor;

import cn.qianyu.domain.Admin;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Slf4j
public class LoginConfig implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.debug("preHandle method is running");
        try{
            HttpSession session = request.getSession();
            Admin admin = (Admin) session.getAttribute("admin");
            System.out.println(admin);
            if (admin!=null){
                return true;
            }
            response.sendRedirect(request.getContextPath()+"/index.html");
        }catch (Exception e){
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        log.debug("postHandle method is running");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.debug("afterCompletion method is running");
    }
}

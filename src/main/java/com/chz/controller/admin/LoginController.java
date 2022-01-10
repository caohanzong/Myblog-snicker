package com.chz.controller.admin;

import com.chz.pojo.User;
import com.chz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

/**
 * @author snicker
 * @date 2021/12/29 16:05
 * @Describe
 */
@Controller
@RequestMapping("/admin")
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String loginPage(){
        return "admin/login";
    }

    //登录
    @PostMapping("/login")
    public String login(@RequestParam String username,
                      @RequestParam String password,
                      HttpSession session,
                      RedirectAttributes attributes){
        User user = userService.checkUser(username, password);
        if(user!=null){
            user.setPassword(null);
            //添加session
            session.setAttribute("user",user);
            return "admin/index";
        }else {
            attributes.addFlashAttribute("message", "用户名和密码错误");
            return "redirect:/admin";
        }
    }

    //注销
    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("user");
        return "redirect:/admin";
    }






}
































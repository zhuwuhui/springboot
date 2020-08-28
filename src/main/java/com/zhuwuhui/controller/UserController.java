package com.zhuwuhui.controller;

import com.zhuwuhui.service.UserService;
import com.zhuwuhui.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhuwuhui
 */
@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/index")
    public String test(){
        return "index";
    }

    @RequestMapping("/getInfo")
    public String getInfo(Model model){
        List<User> list = userService.getInfo();
        model.addAttribute("user",list);
        return "user";
    }
}

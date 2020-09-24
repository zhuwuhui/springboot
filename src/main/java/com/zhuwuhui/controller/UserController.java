package com.zhuwuhui.controller;

import com.zhuwuhui.service.UserService;
import com.zhuwuhui.entity.User;
import com.zhuwuhui.utils.Result;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

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

    /**
    * 猪无悔测试2
    * */
    @RequestMapping("/getInfo")
    public String getInfo(Model model){
        List<User> list = userService.getInfo();
        model.addAttribute("user",list);
        return "user";
    }

    @CrossOrigin
    @PostMapping(value = "api/login")
    @ResponseBody
    public Result login(@RequestBody User user) {
    // 对 html 标签进行转义，防止 XSS 攻击
        String userName = user.getUserName();
        userName = HtmlUtils.htmlEscape(userName);
        boolean isSuccess = userService.checkUser(userName, user.getPassword());
        if (!isSuccess) {
            String message = "账号密码错误";
            System.out.println("test");
            return new Result(400);
        } else {
            return new Result(200);
        }
    }
}

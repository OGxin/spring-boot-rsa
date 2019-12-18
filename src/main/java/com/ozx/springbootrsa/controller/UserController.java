package com.ozx.springbootrsa.controller;

import cn.shuibo.annotation.Decrypt;
import com.ozx.springbootrsa.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName: UserController
 * @Description:TODO
 * @Author ou.zhenxing
 * @Date 2019/12/17 11:48
 * @Version： 1.0
 **/
@Controller
public class UserController {

    @Decrypt
    @PostMapping("/login")
    @ResponseBody
    public User getLoginInfo(@RequestBody User user){
        System.out.println(user.toString());
        return user;
    }

    @GetMapping("/index")
    public String getIndex(){
        return "index";
    }

}

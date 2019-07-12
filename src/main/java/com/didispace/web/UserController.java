package com.didispace.web;

import com.didispace.bean.User;
import com.didispace.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 *@Author chenyun
 * @blog https://blog.csdn.net/sss996
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/print")
    @ResponseBody
    public User printUser(Long id,String userName, String note){
        User uuser = new User();

        uuser.setId(id);
        uuser.setUserName("chen ");

        userService.printUser(uuser);

        return uuser;


    }




}
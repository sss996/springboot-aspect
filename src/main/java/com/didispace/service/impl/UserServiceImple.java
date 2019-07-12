package com.didispace.service.impl;

import com.didispace.bean.User;
import com.didispace.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImple implements UserService {

    @Override
    public void printUser(User user) {
        if(user == null) {
            throw new RuntimeException("请检查用户参数");
        }else {
            System.out.println(" *****  "+ user.getUserName()+"  ****");
        }
    }
}

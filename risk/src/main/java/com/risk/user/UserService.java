package com.risk.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public User findUserById(BigDecimal id){
        return userDao.selectByPrimaryKey(id);
    }
}

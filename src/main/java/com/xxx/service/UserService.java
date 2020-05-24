package com.xxx.service;


import com.xxx.dao.UserDao;
import com.xxx.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public User queryUserById(int id){
        return userDao.queryUserById(id);
    }
}

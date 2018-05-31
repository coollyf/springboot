package com.busy.impl;

import com.busy.UserService;
import com.busy.user;
import com.busy.userDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by acer on 2018/5/31.
 */
@Service
public class UserServiceimpl implements UserService {
    @Autowired
    private userDao userdao;

    @Override
    public user getUserById(Integer id) {
        return userdao.getUserById(id);
    }

    @Override
    public List<user> getUserList() {
        return userdao.getUserList();
    }

    @Override
    public int add(user user) {
        return userdao.add(user);
    }

    @Override
    public int update(Integer id, user user) {
        return userdao.update(id, user);
    }

    @Override
    public int delete(Integer id) {
        return userdao.delete(id);
    }
}

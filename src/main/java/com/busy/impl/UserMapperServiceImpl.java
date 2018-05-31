package com.busy.impl;

import com.busy.UserMapperService;
import com.busy.user;
import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by acer on 2018/5/31.
 */
@Service
public class UserMapperServiceImpl implements UserMapperService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public user getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    @Override
    public List<user> getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public int add(user user) {
        return userMapper.add(user);
    }

    @Override
    public int update(Integer id, user user) {
        return userMapper.update(id, user);
    }

    @Override
    public int delete(Integer id) {
        return userMapper.delete(id);
    }
}

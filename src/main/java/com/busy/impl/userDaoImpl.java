package com.busy.impl;

import com.busy.user;
import com.busy.userDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by acer on 2018/5/31.
 */
@Repository
public class userDaoImpl implements userDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public user getUserById(Integer id) {
        List<user> list = jdbcTemplate.query("select * from user where id = ?", new Object[]{id}, new BeanPropertyRowMapper(user.class));
        if(list!=null && list.size()>0){
            return list.get(0);
        }else{
            return null;
        }
    }

    @Override
    public List<user> getUserList() {
        List<user> list = jdbcTemplate.query("select * from user", new Object[]{}, new BeanPropertyRowMapper(user.class));
        if(list!=null && list.size()>0){
            return list;
        }else{
            return null;
        }
    }

    @Override
    public int add(user user) {
        return jdbcTemplate.update("insert into user(user_name, age) values(?, ?)",
                user.getUserName(),user.getAge());

    }

    @Override
    public int update(Integer id, user user) {
        return jdbcTemplate.update("UPDATE user SET username = ? , age = ? WHERE id=?",
                user.getUserName(),user.getAge(), id);
    }

    @Override
    public int delete(Integer id) {
        return jdbcTemplate.update("DELETE from user where id = ? ",id);
    }
}

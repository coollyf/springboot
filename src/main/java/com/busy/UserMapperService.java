package com.busy;

import java.util.List;

/**
 * Created by acer on 2018/5/31.
 */
public interface UserMapperService {
    user getUserById(Integer id);

    public List<user> getUserList();

    public int add(user user);

    public int update(Integer id, user user);

    public int delete(Integer id);
}

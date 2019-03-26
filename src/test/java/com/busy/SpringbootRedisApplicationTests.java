package com.busy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by acer on 2018/6/11.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRedisApplicationTests {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Test
    public void contextLoads() {

        // 存取字符串
        redisTemplate.opsForValue().set("a", "1");
        Object a = redisTemplate.opsForValue().get("a");
        System.out.println(a);

        // 存取user对象
        redisTemplate.opsForValue().set("user1", new user( "张三",1));
        user user1 = (user) redisTemplate.opsForValue().get("user1");
        System.out.println(user1);
    }


}


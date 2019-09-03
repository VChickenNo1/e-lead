package com.test;

import com.alibaba.fastjson.JSONObject;
import com.huawei.model.Person;
import org.junit.Test;
import redis.clients.jedis.Jedis;

public class JedisTest {

    @Test
    public void test1() {
        Jedis jedis = new Jedis();
        //redis密码
        jedis.auth("root");
        Person p = new Person("常雄彬", "男", 28);
        String perStr = JSONObject.toJSONString(p);
        jedis.hset("user", "cxb", perStr);

    }
}

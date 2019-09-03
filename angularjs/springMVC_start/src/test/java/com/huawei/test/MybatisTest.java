package com.huawei.test;

import com.huawei.dao.IUserDao;
import com.huawei.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.core.io.Resource;

import javax.servlet.ServletContext;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {
    public static void main(String[] args) throws IOException {
        //读取配置
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //工厂创建类
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //工厂
        SqlSessionFactory factory = builder.build(inputStream);
        //获取sqlSession
        SqlSession sqlSession = factory.openSession();
        //拿到dao的代理对象
        IUserDao userDao = sqlSession.getMapper(IUserDao.class);

        List<User> all = userDao.findAll();

        System.out.println(all.toString());


    }
}

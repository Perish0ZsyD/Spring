package com.siyuan.spring6.iocxml.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Siyuan
 * @date 2024/10/13/15:45
 */
public class TestUserDao {
    public static void main(String[] args) {
        ApplicationContext context =  new
                ClassPathXmlApplicationContext("bean.xml");
        // 根据类型获取接口
        UserDao userDao = context.getBean(UserDao.class);
        System.out.println(userDao);
        userDao.run();
    }
}

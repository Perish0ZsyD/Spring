package com.siyuan.spring6.iocxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Siyuan
 * @date 2024/10/13/15:25
 */
public class TestUser {

    public static void main(String[] args) {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("bean.xml");
        // 1、获取bean
        User user1 = (User) context.getBean("user"); // getBean返回Object对象，要转换成User
        System.out.println("1、根据id获取bean: " + user1);

        // 2、根据类型获取bean(要求IOC容器中指定类型的bean唯一，可能id不一样<id获取不影响,1和3获取>)
        User user2 = context.getBean(User.class);
        System.out.println("2、根据类型获取bean: " + user2);

        // 3、根据id和类型
        User user3 = context.getBean("user", User.class);
        System.out.println("3、根据id和类型获取bean: " + user3);
    }
}

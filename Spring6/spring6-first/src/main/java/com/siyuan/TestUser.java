package com.siyuan;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Siyuan
 * @date 2024/10/12/21:48
 */
public class TestUser {

    // 创建Logger对象
    private final Logger logger = LoggerFactory.getLogger(TestUser.class);

    @Test
    public void testUserObject() {
        // 加载spring配置文件，对象创建
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");

        // 获取创建的对象
        User user = (User)context.getBean("user");

        // 使用对象调试方法测试
        user.Helloword();

        // 手动写日志
        logger.info("#执行调用成功..");
    }

    // 反射创建对象
    @Test
    public void testUserReflect() throws Exception {
        // 获取类Class对象
        Class<?> clazz = Class.forName("com.siyuan.User");
        //
        User user = (User)clazz.getDeclaredConstructor().newInstance();
        System.out.println(user);
    }
}

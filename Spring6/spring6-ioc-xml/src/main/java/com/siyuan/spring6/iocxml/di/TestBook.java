package com.siyuan.spring6.iocxml.di;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Siyuan
 * @date 2024/10/13/18:45
 */
public class TestBook {

    @Test
    public void testSetter() {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("bean-di.xml");
//        Book book = (Book) context.getBean("book", Book.class);
        Book book = (Book) context.getBean("bookCon", Book.class); //
        System.out.println(book);
    }
}

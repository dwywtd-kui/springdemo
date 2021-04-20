package com.haan.springdemo.xmldemo.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hanliukui
 * @Date 2021/4/20 20:01
 */
public class LifeCycleTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:/xmldemo/lifecycle.xml");
        System.out.println("started...");
//        Book book = (Book) context.getBean("book");
//        System.out.println(book);
//
        Book book3 = (Book) context.getBean("book3");
        System.out.println(book3);


        // 关闭容器，会销毁容器中的所有Bean
        context.close();
    }
}

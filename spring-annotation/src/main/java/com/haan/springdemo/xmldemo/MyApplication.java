package com.haan.springdemo.xmldemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/xmldemo/beans.xml");
        User user = (User) applicationContext.getBean("user");
        System.out.println(user.getName());

        //使用setter赋值属性创建的bean book
        Book book = (Book) applicationContext.getBean("book");
        System.out.println(book);

        //使用有参构造函数赋值属性创建的bean order
        Order order = (Order) applicationContext.getBean("order");
        System.out.println(order);


        //使用有参构造函数赋值属性创建的bean order
        User3 user3 = (User3) applicationContext.getBean("user3");
        System.out.println(user3);



    }
}

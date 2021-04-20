package com.haan.springdemo.xmldemo.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author hanliukui
 * @Date 2021/4/20 20:00
 */
public class Book implements InitializingBean, DisposableBean {

    private String name;
    private String author;

    public Book(){
        System.out.println("Book 无参构造");
    }

    public Book(String name,String author){
        System.out.println("Book 有参构造...");
        this.name=name;
        this.author=author;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Book setName");
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        System.out.println("Book setAuthor");
        this.author = author;
    }

    public void initMethod(){
        System.out.println("Book init method...");
    }

    public void  destroyMethod(){
        System.out.println("Book destroy...");
    }


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean afterPropertiesSet...");
    }

    @Override
    public void destroy(){
        System.out.println("DisposableBean destroy...");
    }
}

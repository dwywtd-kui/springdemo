package com.haan.springdemo.annotation.propertiesassigning;

import org.springframework.beans.factory.annotation.Value;

public class Person {

    @Value(value = "张飞")
    private String name;

    @Value(value = "#{11+22}")
    private Integer age;

    @Value(value = "${person.mobile}")
    private String mobile;

//    无参构造函数
    public Person(){

    }
//    有参构造函数
    public Person(String name,Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}

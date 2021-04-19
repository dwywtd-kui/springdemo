package com.haan.springdemo.xmldemo;

public class Order {
    //属性
    private String  name;
    private String  address;

    //有参数构造
    public Order(String name,String address) {
        this. name = name;
        this. address = address;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

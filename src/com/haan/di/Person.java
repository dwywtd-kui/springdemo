package com.haan.di;

/**
 * @Desc
 * @Created By liukuihan
 * @date on 2020/5/23
 */
public class Person {
    private String name;
    private Integer age;
    private String tel;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, Integer age, String tel) {
        this.name = name;
        this.age = age;
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tel='" + tel + '\'' +
                '}';
    }
}

package com.haan.di;

/**
 * @Desc
 * @Created By liukuihan
 * @date on 2020/5/23
 */
public class Student {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

//    <bean id="student" class="com.haan.di.Student">
//        <property name="name" value="libai"/>
//        <property name="age" value="22"/>
//    </bean>
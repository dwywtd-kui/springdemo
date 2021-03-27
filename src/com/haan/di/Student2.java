package com.haan.di;

/**
 * @Desc
 * @Created By liukuihan
 * @date on 2020/5/23
 */
public class Student2 {
    private String name;            //基本类型
    private int age;                //基本类型
    private AddressInfo addressInfo; //引用类型

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddressInfo(AddressInfo addressInfo) {
        this.addressInfo = addressInfo;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addressInfo=" + addressInfo +
                '}';
    }
}

//    <bean id="student2" name="student2" class="com.haan.di.Student2">
//        <property name="name" value="libai" />
//        <property name="age" value="22"/>
//        <property name="addressInfo" ref="addressInfo"/>
//    </bean>
//
//    <bean id="addressInfo" class="com.haan.di.AddressInfo">
//        <property name="tel" value="1008611"/>
//        <property name="city" value="上海" />
//    </bean>
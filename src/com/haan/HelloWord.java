package com.haan;

/**
 * @Desc
 * @Created By liukuihan
 * @date on 2020/5/23
 */
public class HelloWord {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void sayHello() {
        System.out.println("hello world!");
    }
}

//    <bean class="com.haan.HelloWord" id="helloWord"></bean>
//
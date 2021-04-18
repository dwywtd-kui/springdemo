package com.haan.springdemo.annotation.beanleftcycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hanliukui
 * @Date 2021/4/14 20:25
 */
@Configuration
public class MyApplication {

    /**
     * initMethod:指定Bean初始化方法
     * destroyMethod:指定Bean销毁时执行方法
     * @return
     */
    @Bean(value = "dog",initMethod = "init",destroyMethod = "destroy")
    public Dog dog(){
        return new Dog();
    }

    @Bean
    public Cat cat(){
        return new Cat();
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyApplication.class);
        System.out.println("初始化容器结束...");

        System.out.println("移除Bean dog...");
        context.removeBeanDefinition("dog");
        System.out.println("移除Bean dog 后...");

        System.out.println("移除Bean cat...");
        context.removeBeanDefinition("cat");
        System.out.println("移除Bean cat 后...");

        System.out.println("关闭容器...");
        context.close();
        System.out.println("关闭容器后...");
    }
}

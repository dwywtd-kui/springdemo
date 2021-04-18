package com.haan.springdemo.annotation.propertiesassigning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

@Configuration
@PropertySource(value = {"classpath:/person.properties"})
public class MyApplication {

    @Bean
    public Person person1(){
        return new Person();
    }

    @Bean
    public Person person2(){
        return new Person("李白",112);
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyApplication.class);
        System.out.println("=======================");

        Person person1 = (Person) applicationContext.getBean("person1");
        System.out.println(person1);

        Person person2 = (Person) applicationContext.getBean("person2");
        System.out.println(person2);

//        获取环境变量中配置文件中的key/value
        System.out.println("读取配置文件导入的环境变量key/value=======");
        ConfigurableEnvironment environment = applicationContext.getEnvironment();

        String personName = environment.getProperty("person.name");
        System.out.println(personName);
        String personAge = environment.getProperty("person.age");
        System.out.println(personAge);
        String personMobile = environment.getProperty("person.mobile");
        System.out.println(personMobile);

    }
}

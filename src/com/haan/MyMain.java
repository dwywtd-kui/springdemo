package com.haan;

import com.haan.test01.AnimalService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Desc
 * @Created By liukuihan
 * @date on 2020/5/23
 */
@ComponentScan
@Configuration
public class MyMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyMain.class);
        AnimalService animalService = context.getBean(AnimalService.class);
        animalService.say();
    }
}

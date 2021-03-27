package com.haan.test01;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //标识为首选Bean
public class Cat implements IAnimal {

    @Override
    public void say() {
        System.out.println("miao miao ~~~");
    }
}

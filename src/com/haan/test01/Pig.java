package com.haan.test01;

import org.springframework.stereotype.Component;

@Component
public class Pig implements IAnimal {
    @Override
    public void say() {
        System.out.println("heng heng ~~~");
    }
}

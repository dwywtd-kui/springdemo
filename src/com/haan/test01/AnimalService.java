package com.haan.test01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalService {

    @Autowired
    @Qualifier(value = "dog")
    private IAnimal animal;

    public void say() {
        animal.say();
    }
}

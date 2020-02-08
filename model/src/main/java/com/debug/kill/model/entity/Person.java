package com.debug.kill.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@Data
public class Person {

    private String name;
    private int age;
    private double height;
    private double weight;


    public Person(String name, int age, double height, double weight, String sex) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }


}

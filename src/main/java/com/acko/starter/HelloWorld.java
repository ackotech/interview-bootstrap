package com.acko.starter;

import lombok.AllArgsConstructor;
import lombok.Data;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello Word");
        System.out.println(new Person("Ashvini", "SDE"));
    }
}

@Data
@AllArgsConstructor
class Person{
    private String name;
    private String designation;
}

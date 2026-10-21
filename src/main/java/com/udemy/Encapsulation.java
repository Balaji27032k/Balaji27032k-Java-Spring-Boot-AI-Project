package com.udemy;

class Human {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
/* Encapsulation is a fundamental concept in object-oriented programming
 that involves bundling data and methods that operate on 
 that data within a single unit, typically a class. 
 It also involves restricting direct access to some of 
 an object's components, which is a way of preventing unintended 
 interference and misuse of the data. 
 */
public class Encapsulation {
    public static void main(String args[])
    {
        Human obj = new Human();
        obj.setAge(25);
        obj.setName("Navin");
        System.out.println(obj.getName());
    }
}

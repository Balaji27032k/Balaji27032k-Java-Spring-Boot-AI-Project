package com.udemy;
/* A static block is a block of code that is executed when the class is loaded into memory, before any objects of the class are created. It is used to initialize static variables or perform any setup that needs to be done once for the class. Static blocks are executed only once, when the class is first loaded.
On the other hand, a constructor is a special method that is called when an object of the class is created. It is used to initialize instance variables and perform any setup that needs to be done for each object. Constructors can be overloaded, meaning a class can have multiple constructors with different parameters, while static blocks cannot be overloaded. Additionally, constructors can be called multiple times, once for each object created, while static blocks are called only once when the class is loaded. In summary, static blocks are used for class-level initialization, while constructors are used for object-level initialization.
 */

class X{
    int a;
    static{
        System.out.println("Static Block is invoked");
    }
    X(){
        System.out.println("Constructor is invoked");
    }
}
public class StaticBlock {
    public static void main(String args[]) throws ClassNotFoundException
    {
        System.out.println("Main Method is invoked");
        Class.forName("com.udemy.X");
    }
}

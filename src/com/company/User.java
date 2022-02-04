package com.company;

public class User {
    // fields (attributes)
    public  String name;

    //constructor
    public User(String name){
        this.name = name;
    }


    //methods

    public void sayHello() {
        System.out.println("Merhabalar "+name);
    }
}

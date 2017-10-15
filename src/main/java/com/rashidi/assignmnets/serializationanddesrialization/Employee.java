package com.rashidi.assignmnets.serializationanddesrialization;

public class Employee implements java.io.Serializable{

    public int age;
    public String name;

    // Default constructor
    public Employee(int age, String name)
    {
        this.age = age;
        this.name = name;
    }
}

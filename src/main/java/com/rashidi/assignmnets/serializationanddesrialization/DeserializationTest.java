package com.rashidi.assignmnets.serializationanddesrialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Deserialization is the reverse process of converting the byte stream to the actual Java object in memory.
 *
 * @author Mina Rashidi
 */
public class DeserializationTest {

    public static void main(String[] args) {

        //Reading the object from a file
        String filename = "file.txt";
        Employee employee;
        try {
            FileInputStream file = new FileInputStream(filename);

            ObjectInputStream in = new ObjectInputStream(file);

            employee = (Employee) in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized ");
            System.out.println("age = " + employee.age);
            System.out.println("name = " + employee.name);


        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        }
    }
}

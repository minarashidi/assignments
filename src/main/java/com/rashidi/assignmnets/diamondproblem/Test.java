package com.rashidi.assignmnets.diamondproblem;

/**
 * public class SerializationTest extends Parent1, Parent2
 * Compiler Error : SerializationTest is inheriting from multiple classes
 * How are above problems handled by Default Methods and Interfaces ?
 */
public class Test implements ParentInterface1, ParentInterface2 {
    // Overriding default show method
    public void show() {
        // use super keyword to call the show
        ParentInterface1.super.show();
        ParentInterface2.super.show();
    }

    public static void main(String args[]) {
        Test d = new Test();
        d.show();
    }
}

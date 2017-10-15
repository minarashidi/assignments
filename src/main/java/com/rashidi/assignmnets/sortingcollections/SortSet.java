package com.rashidi.assignmnets.sortingcollections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class SortSet {
    public static void main(String[] args) {

        Set<Student> students = new HashSet<Student>();
        students.add(new Student(1, "mina", 27));
        students.add(new Student(5, "sara", 30));
        students.add(new Student(10, "ryan", 25));

        System.out.println("---Natural sorting by name---");
        students.stream().sorted().forEach(s -> System.out.println("Id: " + s.getId() + " Name: " + s.getName() + " Age: " + s.getAge()));

        System.out.println("---Natural sorting by name in reverse---");
        students.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println("Id: " + s.getId() + " Name: " + s.getName() + " Age: " + s.getAge()));

        System.out.println("---Sorting using comparator by age---");
        students.stream().sorted(Comparator.comparing(Student::getAge)).forEach(s -> System.out.println("Id: " + s.getId() + " Name: " + s.getName() + " Age: " + s.getAge()));

        System.out.println("---Sorting using comparator by age in reverse");
        students.stream().sorted(Comparator.comparing(Student::getAge).reversed()).forEach(s -> System.out.println("Id: " + s.getId() + " Name: " + s.getName() + " Age: " + s.getAge()));


    }
}

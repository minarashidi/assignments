package com.rashidi.assignmnets.sortingcollections;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "mina", 27));
        students.add(new Student(5, "sara", 30));
        students.add(new Student(10, "ryan", 25));

        System.out.println("---Natural sorting by name---");
        List<Student> sortedList = students.stream().sorted().collect(Collectors.toList());
        sortedList.forEach(s -> System.out.println("Id: " + s.getId() + " Name: " + s.getName() + " Age: " + s.getAge()));

        System.out.println("---Natural sorting by name in reverse order---");
        sortedList = students.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        sortedList.forEach(s -> System.out.println("Id: " + s.getId() + " Name: " + s.getName() + " Age: " + s.getAge()));

        System.out.println("---Sorting using comparator by age---");
        sortedList = students.stream().sorted(Comparator.comparing(Student::getAge)).collect(Collectors.toList());
        sortedList.forEach(s -> System.out.println("Id: " + s.getId() + " Name: " + s.getName() + " Age: " + s.getAge()));

        System.out.println("---Sorting using comparator by age in reverse order---");
        sortedList = students.stream().sorted(Comparator.comparing(Student::getAge).reversed()).collect(Collectors.toList());
        sortedList.forEach(s -> System.out.println("Id: " + s.getId() + " Name: " + s.getName() + " Age: " + s.getAge()));

    }
}

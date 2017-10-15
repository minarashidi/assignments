package com.rashidi.assignmnets.sortingcollections;

import java.util.*;
import java.util.stream.Collectors;

public class SortMap {
    public static void main(String[] args) {

        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("z", 10);
        unsortedMap.put("b", 5);
        unsortedMap.put("a", 6);
        unsortedMap.put("c", 20);
        unsortedMap.put("d", 1);
        unsortedMap.put("e", 7);
        unsortedMap.put("y", 8);
        unsortedMap.put("n", 99);
        unsortedMap.put("g", 50);
        unsortedMap.put("m", 2);
        unsortedMap.put("f", 9);

        System.out.println("---Sort by map key---");
        unsortedMap.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).forEach(e -> System.out.println("Key: " + e.getKey() + " Value: " + e.getValue()));

        System.out.println("---Sort by map key in reverse/desc---");
        Map<String, Integer> sortedMapByKeyInDesc = unsortedMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        System.out.println("---Sort by map value---");
        unsortedMap.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).forEach(e -> {
                    String key = e.getKey();
                    Integer value = e.getValue();
                    System.out.println("Key: " + key + " Value: " + value);
                }
        );

        System.out.println("---Sort by map value in reverse---");
        Map<String, Integer> sortedByValue = unsortedMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));


        System.out.println("---Return a sorted list of keys in desc/reverse---");
        List<String> sortedKeys = unsortedMap.entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).map(Map.Entry::getKey).collect(Collectors.toList());
        sortedKeys.forEach(System.out::println);




//        System.out.println("---java 7---");
//        Map<Integer,String> sortedMap=new TreeMap<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2.compareTo(o1);
//            }
//        });
//
//        System.out.println("---with lambda---");
//        Map<Integer,String> sortedMap1=new TreeMap<>((o1, o2) -> o2.compareTo(o1));
//
//        System.out.println("---java 8---");
//        Map<Integer,String> sortedMap2=new TreeMap<>(Comparator.reverseOrder());


    }

}

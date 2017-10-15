package com.rashidi.assignmnets.builder;

public class Bootstrap {
    public static void main(String[] args) {

        User user1 = new User.UserBuilder("Mina", "Rashidi")
                .age(29)
                .phone("123456")
                //no address
                .build();

        System.out.println(user1);

        User user2 = new User.UserBuilder("Sara", "Ahamdi")
                .age(38)
                //no phone
                //no address
                .build();

        System.out.println(user2);

        User user3 = new User.UserBuilder("Ryan", "johansson")
                //no age
                .build();

        System.out.println(user3);
    }
}

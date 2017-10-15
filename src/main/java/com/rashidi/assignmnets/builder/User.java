package com.rashidi.assignmnets.builder;

/**
 * The builder pattern, as name implies, is an alternative way to construct complex different immutable objects.
 * In any user management module, primary entity is User. Ideally and practically as well,
 * once a user object is fully created, you will not want to change it’s state.
 * our User object has following 5 attributes i.e. firstName, lastName, age, phone and address.
 * firstName and lastName are mandatory and rest 3 fields are optional.
 *
 * @author Mina Rashidi
 */
public class User {

    private final String firstName;
    private final String lastName;
    private final int age;
    private final String phone;
    private final String address;

    public User(UserBuilder userBuilder) {
        this.firstName=userBuilder.firstName;
        this.lastName=userBuilder.lastName;
        this.age=userBuilder.age;
        this.phone=userBuilder.phone;
        this.address=userBuilder.address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class UserBuilder {

        private final String firstName;
        private final String lastName;
        private int age;
        private String phone;
        private String address;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            User user=new User(this);
            validateUserObject(user);
            return user;
        }

        private void validateUserObject(User user) {
            // do some basic validations to check
        }
    }
}

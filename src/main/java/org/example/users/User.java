package org.example.users;

public class User {
    private String name;
    private String surname;

    //contructor

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String fullname() {
        return name + " " + surname;
    }
}

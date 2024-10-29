package org.example.users;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Leandra", "Garcia");
        User user2 = new User("Leopoldo", "Saez");
        User user3 = new User("Sergi", "Virgili");

        // utilizando algún bucle imprime los fulnammes de 3 usuarios diferentes
        User[] users = {user1, user2, user3};
        for (User user : users) {
            System.out.println(user.fullname());
        }

    }
}

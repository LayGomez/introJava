package org.example.BasicLogin;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        String user1 = "admin";
        String password1 = "1234";

        int i = 0;
        while (i < 3) {
            Scanner user = new Scanner(System.in);
            Scanner password = new Scanner(System.in);

            String userInput = user.nextLine();
            String passInput = password.nextLine();

            if (!user1.equals(userInput) || !password1.equals(passInput)) {
                System.out.println("El usuario o la contraseña incorrecta");
                i++;
            } else {
                System.out.println("El usuario y la contraseña son correctas");
                break;
            }
            if (i == 3) {
                System.out.println("No quedan intentos");
            }

        }

    }
}

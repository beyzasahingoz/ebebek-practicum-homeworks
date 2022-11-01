/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week2;

import java.util.Scanner;

/**
 *
 * @author ayza
 */
public class UserAuth {

    public static void main(String[] args) {

        String username, password, newPassword, yes;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter username: ");
        username = input.nextLine();

        System.out.println("Please enter password: ");
        password = input.nextLine();
        if (username.equals("Beyza") && (password.equals("bfalconeye"))) {
            System.out.println("Logged in!");
        } else if (!password.equals("bfalconeye")) {
            System.out.println("Wrong password. Wanna change your password?\nEvet\nHayır");
            yes = input.nextLine();
            if (!yes.equals("Yes")) {
                System.out.println("Goodbye.");
            } else if (yes.equals("Yes")) {
                System.out.println("Please enter new password: ");
                newPassword = input.nextLine();
                if (newPassword.equals("bfalconeye")) {
                    System.out.println("Cannot be the same previous one.");
                } else {
                    System.out.println("Changed!");
                }
            }
        }
    }
}

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
public class OrderingNumbers {

    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        a = input.nextInt();

        System.out.println("Enter second number: ");
        b = input.nextInt();

        System.out.println("Enter third number: ");
        c = input.nextInt();
        if ((a == b) || (b == c) || (a == c)) {
            System.out.println("Numbers can not be equal!");
        } else {
            if ((a < b) && (a < c)) {
                if (b < c) {
                    System.out.println(a + "<" + b + "<" + c);

                } else {
                    System.out.println(a + "<" + c + "<" + b);
                }
            } else if ((b < a) && (b < c)) {
                if (a < c) {
                    System.out.println(b + "<" + a + "<" + c);

                } else {
                    System.out.println(b + "<" + c + "<" + a);
                }

            } else {
                if (b < a) {
                    System.out.println(c + "<" + b + "<" + a);

                } else {
                    System.out.println(c + "<" + a + "<" + b);
                }
            }
        }
    }
}

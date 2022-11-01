/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week3;

import java.util.Scanner;

/**
 *
 * @author ayza
 */
public class TersUcgen {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Basamak sayisini giriniz: ");
        num = in.nextInt();
        for (int i = num; i >= 1; i--) {
            for (int j = num - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = (2 * i - 1); k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println(" ");

        }
    }
}

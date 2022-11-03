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
public class ExponentialNumbers {
    public static void main(String[] args) {
        System.out.println("Enter limit number:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = 1; i <= num; i*=2) {
            System.out.println(i);
        }
    }
}

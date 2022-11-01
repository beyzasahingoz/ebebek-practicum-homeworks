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
public class PatternMethod {

    public static int decreasePattern(int num) {
        if (num < 0 || num == 0) {
            return num;
        } else {
            System.out.print(num + " ");
            return decreasePattern(num - 5);
        }
    }

    public static int increasePattern(int num, int inc) {
        if (num > inc) {
            return num;
        } else {
            System.out.print(num + " ");
            return increasePattern(num + 5, inc);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        int num = s.nextInt();
        increasePattern(decreasePattern(num), num);
    }
}

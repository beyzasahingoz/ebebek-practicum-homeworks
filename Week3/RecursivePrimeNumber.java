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
public class RecursivePrimeNumber {

    static boolean isPrime(int n, int j) {
        if (n == j) {
            return true;
        }
        if (n % j == 0) {
            return false;
        }
        return isPrime(n, j + 1);
    }

    public static void main(String[] args) {
        int num;
        System.out.println("Sayi giriniz : ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        System.out.print(isPrime(num, 2) ? num + " asal bir sayidir." : num + " asal bir sayi degildir.");
    }
}

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
public class PerfectNumber {

    public static void main(String[] args) {
        System.out.println("Sayi giriniz: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            System.out.println(num + " mukemmel sayi");
        } else {
            System.out.println(num + " mukemmel sayi degil");
        }
    }
}

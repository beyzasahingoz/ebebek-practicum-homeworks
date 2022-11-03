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
public class FactorialNumbers {

    public static void main(String[] args) {
        int n, r, com;
        int facn = 1, facr = 1, facnr = 1;
        System.out.print("Lütfen kombinasyonu alınacak sayıyı giriniz: ");
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen kaçlı kombinasyonunu almak istiyorsanız sayıyı giriniz: ");
        n = input.nextInt();
        r = input.nextInt();
        for (int i = 1; i <= n; i++) {
            facn *= i;
        }
        for (int i = 1; i <= r; i++) {
            facr *= i;
        }
        for (int i = 1; i <= (n - r); i++) {
            facnr *= i;
        }
        com = facn / (facr * facnr);
        System.out.print("Kombinasyon: " + com);
    }
}

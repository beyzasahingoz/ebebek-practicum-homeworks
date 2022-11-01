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
public class UsHesabiYapma {

    public static void main(String[] args) {
        System.out.println("Taban degeri giriniz: ");
        Scanner in = new Scanner(System.in);
        int base = in.nextInt();
        System.out.println("Us degeri giriniz: ");
        int us = in.nextInt();
        int result = (int) Math.pow(base, us);
        System.out.println("Sonuc: " + result);
    }
}

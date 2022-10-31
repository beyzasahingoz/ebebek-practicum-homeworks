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
public class ArtikYilHesaplama {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Yil giriniz: ");
        int year = in.nextInt();
        if (year % 400 == 0) {
            System.out.println(year + " bir artik yil.");
        } else {
            System.out.println(year + " bir artik yil degil.");
        }
    }
}

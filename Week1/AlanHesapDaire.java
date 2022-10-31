/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week1;

import java.util.Scanner;

/**
 *
 * @author ayza
 */
public class AlanHesapDaire {

    public static void main(String[] args) {

        int r;
        double pi = 3.14, alanFormul, cevreFormul, dilimAlan;
        double a;

        Scanner in = new Scanner(System.in);

        System.out.print("Yarı Çap : ");
        r = in.nextInt();
        System.out.print("Alfa Değeri : ");
        a = in.nextDouble();

        alanFormul = pi * r * r;
        cevreFormul = 2 * pi * r;
        System.out.println("Dairenin alanı : " + alanFormul);
        System.out.println("Dairenin cevresi : " + cevreFormul);

        dilimAlan = pi * (r * r) * a / 360;
        System.out.println("Daire Diliminin alanı : " + dilimAlan);
    }
}

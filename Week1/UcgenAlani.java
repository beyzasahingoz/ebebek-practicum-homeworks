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
public class UcgenAlani {

    public static void main(String[] args) {

        int A, B, C, Cevre, u;
        double Alan;

        Scanner in = new Scanner(System.in);

        System.out.print("1. Kenar Giriniz : ");
        A = in.nextInt();

        System.out.print("2. Kenar Giriniz : ");
        B = in.nextInt();

        System.out.print("3. Kenar Giriniz : ");
        C = in.nextInt();

        u = (A + B + C) / 2;
        Cevre = 2 * u;
        System.out.println("Çevre Uzunluğu : " + Cevre);

        Alan = Math.sqrt(u * (u - A) * (u - B) * (u - C));
        System.out.println("Alan Uzunluğu : " + Alan);

    }
}

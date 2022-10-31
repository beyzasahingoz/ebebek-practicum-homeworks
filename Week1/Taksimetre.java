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
public class Taksimetre {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Mesafeyi giriniz= ");
        int yol = in.nextInt();
        double tutar = (yol * 2.20) + 10;
        double odeme;
        if (tutar >= 20) {
            odeme = tutar;
        } else {
            odeme = 20;
        }

        System.out.println("Odeme = " + odeme);

    }
}

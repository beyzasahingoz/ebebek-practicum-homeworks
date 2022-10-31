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
public class KDVTutari {

    public static void main(String[] args) {
        double tutar, kdvOran = 0.18, kdvOran2 = 0.8;
        Scanner in = new Scanner(System.in);
        System.out.println("Ücret tutarini giriniz: ");
        tutar = in.nextDouble();
        double sum = 0;
        if (tutar > 1000) {
            sum = tutar * kdvOran;
        } else {
            sum = tutar * kdvOran2;
        }
        System.out.println("Tutar : " + tutar);
        System.out.println("Kdvsiz Tutar : " + (tutar - sum));
        System.out.println("Toplam Kdv : " + sum);
    }
}

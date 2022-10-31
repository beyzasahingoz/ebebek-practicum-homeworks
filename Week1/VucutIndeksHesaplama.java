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
public class VucutIndeksHesaplama {
    public static void main(String[] args) {
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        Scanner scanner1= new Scanner(System.in);
        double height=scanner1.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz: ");
        Scanner scanner2= new Scanner(System.in);
        double weight=scanner2.nextDouble();
        double indeks=weight/(height*height);
        System.out.println("Vücut Kitle Indeksiniz: "+indeks);
    }
}

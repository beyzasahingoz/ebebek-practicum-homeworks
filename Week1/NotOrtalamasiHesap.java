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
public class NotOrtalamasiHesap {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Matematik notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Turkce notunuz : ");
        turkce = inp.nextInt();

        System.out.print("Tarih notunuz : ");
        tarih = inp.nextInt();

        System.out.print("Muzik notunuz : ");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam /6;
        System.out.println("Ortalamanız : " + sonuc);
        boolean durum=sonuc>=60;
        System.out.println(durum? "Sınıfı Geçti": "Sınıfta Kaldı");
    }
}
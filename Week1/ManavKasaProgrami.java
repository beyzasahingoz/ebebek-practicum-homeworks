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
public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armut=2.14, elma=3.67, domates=1.11,muz=0.95,patlican=5.00;
        Scanner scanner1= new Scanner(System.in);
        System.out.println("Armut Kaç Kilo?: ");
        double a=scanner1.nextDouble();
        
        Scanner scanner2= new Scanner(System.in);
        System.out.println("Elma Kaç Kilo?: ");
        double e=scanner2.nextDouble();
        
        Scanner scanner3= new Scanner(System.in);
        System.out.println("Domates Kaç Kilo?: ");
        double d=scanner3.nextDouble();
        
        Scanner scanner4= new Scanner(System.in);
        System.out.println("Muz Kaç Kilo?: ");
        double m=scanner4.nextDouble();
        
        Scanner scanner5= new Scanner(System.in);
        System.out.println("Patlican Kaç Kilo?: ");
        double p=scanner5.nextDouble();
        double sum=(a*armut)+(e*elma)+(d*domates)+(m*muz)+(p*patlican);
        System.out.println("Toplam tutar: "+sum);
    }
}

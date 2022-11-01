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
public class MaxMinBulma {
    public static void main(String[] args) {
        System.out.println("Kac sayi gireceksiniz: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int input;
        int [] arr=new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println(i+1+". sayiyi giriniz: ");
            input=in.nextInt();
            arr[i]=input;
        }
        int temp;
        for (int j = 0; j < arr.length; j++) {
            for (int k = 1; k < (arr.length - j); k++) {
                if (arr[k - 1] > arr[k]) {
                    temp = arr[k];
                    arr[k] = arr[k - 1];
                    arr[k - 1] = temp;
                }
            }
        }
        System.out.println("En buyuk sayi: "+ arr[num-1]);
        System.out.println("En kucuk sayi: "+ arr[0]);
    }
}

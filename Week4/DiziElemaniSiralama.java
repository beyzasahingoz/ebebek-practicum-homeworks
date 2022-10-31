/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week4;

import java.util.Scanner;

/**
 *
 * @author ayza
 */
public class DiziElemaniSiralama {

    public static void main(String[] args) {
        System.out.println("Dizinin boyutu: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Dizinin elemanlarını giriniz: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            System.out.println("Dizinin " + (i + 1) + ". elemanı: " + arr[i]);
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
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t" + arr[i]);
        }
    }
}

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
public class EvenNumbers {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner in= new Scanner(System.in);
        int num=in.nextInt();
        
        for (int i = 0; i < num; i++) {
            if(i%2==0)
                System.out.println(i);
        }
    }
}
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
public class HarmonicNumbers {
 public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number : ");
        double total=0,num=scanner.nextInt();
        for (double i=1;i<=num;i++){
            total+=1/i;
        }
        System.out.print(total);
    }
}

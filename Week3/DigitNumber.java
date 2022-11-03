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
public class DigitNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz:");
        int number = input.nextInt();
        int basValue, basSum = 0;

        while (number != 0) {
            basValue = number % 10;
            basSum += basValue;
            number /= 10;
        }
        System.out.println(number + " sayısının basamakları toplamı = " + basSum);
    }
}

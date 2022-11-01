/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week3;

/**
 *
 * @author ayza
 */
public class AsalSayilar {

    public static void main(String[] args) {
        boolean isPrime;
        for (int i = 2; i <= 100; i++) {
            isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }

    }
}

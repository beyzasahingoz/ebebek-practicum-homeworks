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
public class ExpNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y, result = 1;

        System.out.print("Üssü Alınacak Sayıyı Giriniz : ");
        x = input.nextInt();

        System.out.print("Kuvveti Giriniz : ");
        y = input.nextInt();

        for (int i = 1; i <= y; i++) {
            result *= x;
        }
        System.out.println(x + " üzeri " + y + " = " + result);
    }
}

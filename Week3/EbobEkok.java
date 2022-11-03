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
public class EbobEkok {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci sayı : ");
        int n1 = scan.nextInt();
        System.out.println("İkinci sayı : ");
        int n2 = scan.nextInt();
        int ebob = 0;

        int counter = 1;
        while (counter <= Math.max(n1, n2)) {
            if (n1 % counter == 0) {
                if (n2 % counter == 0) {
                    ebob = counter;
                }
            }
            counter++;
        }
        int ekok = (n1 * n2) / ebob;
        System.out.println("Sayıların ebobu = " + ebob + "\nSayıların ekoku = " + ekok);
    }
}

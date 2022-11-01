/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week2;

import java.util.Scanner;

/**
 *
 * @author ayza
 */
public class TemparatureEvents {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter temparature: ");
        int heat = input.nextInt();

        if (heat < 5) {
            System.out.println("You can go to kayak.");
        } else if (heat <= 25) {
            if (heat <= 15) {
                System.out.println("You can go to cinema");
            } else {
                System.out.println("You can go to picnic.");
            }
        } else {
            System.out.println("You can go to swimming.");
        }
    }
}

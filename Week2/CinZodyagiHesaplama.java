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
public class CinZodyagiHesaplama {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dogum yilinizi giriniz: ");
        int year=in.nextInt();
        switch(year%12){
            case 0:
                System.out.println("Cin Zodyagi Burcunuz : Maymun");
                break;
            case 1:
                System.out.println("Cin Zodyagi Burcunuz : Horoz ");
                break;
            case 2:
                System.out.println("Cin Zodyagi Burcunuz : Kopek ");
                break;
            case 3:
                System.out.println("Cin Zodyagi Burcunuz : Domuz");
                break;
            case 4:
                System.out.println("Cin Zodyagi Burcunuz : Fare ");
                break;
            case 5:
                System.out.println("Cin Zodyagi Burcunuz : Okuz ");
                break;
            case 6:
                System.out.println("Cin Zodyagi Burcunuz : Kaplan");
                break;
            case 7:
                System.out.println("Cin Zodyagi Burcunuz : Tavsan ");
                break;
            case 8:
                System.out.println("Cin Zodyagi Burcunuz : Ejderha");
                break;
            case 9:
                System.out.println("Cin Zodyagi Burcunuz : Yilan");
                break;
            case 10:
                System.out.println("Cin Zodyagi Burcunuz : At");
                break;
            case 11:
                System.out.println("Cin Zodyagi Burcunuz : Koyun");
                break;
            default:
                System.out.println("Error");
                
        }
    }
}

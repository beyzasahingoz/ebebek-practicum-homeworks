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
public class ClassSituation {

    public static void main(String[] args) {

        int math, turkish, physics, music, chemistry, temp;
        double average, count = 5.0;

        Scanner getGrade = new Scanner(System.in);

        System.out.print("Matematik Notunuz:");
        temp = getGrade.nextInt();
        math = (temp > 0 && temp <= 100) ? temp : 0;
        count = (math == 0) ? (count - 1) : count;

        System.out.print("Turkce Notunuz:");
        temp = getGrade.nextInt();
        turkish = (temp > 0 && temp <= 100) ? temp : 0;
        count = (turkish == 0) ? (count - 1) : count;

        System.out.print("Fizik Notunuz:");
        temp = getGrade.nextInt();
        physics = (temp > 0 && temp <= 100) ? temp : 0;
        count = (physics == 0) ? (count - 1) : count;

        System.out.print("Muzik Notunuz:");
        temp = getGrade.nextInt();
        music = (temp > 0 && temp <= 100) ? temp : 0;
        count = (music == 0) ? (count - 1) : count;

        System.out.print("Kimya Notunuz:");
        temp = getGrade.nextInt();
        chemistry = (temp > 0 && temp <= 100) ? temp : 0;
        count = (chemistry == 0) ? (count - 1) : count;

        average = (math + turkish + physics + music + chemistry) / count;
        if (average >= 55) {
            System.out.println("Average: " + average + ". Passed!");
        } else {
            System.out.println("Average: " + average + " . Cannot passed!");
        }
    }
}

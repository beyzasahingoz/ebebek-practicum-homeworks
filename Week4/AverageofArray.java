/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week4;

/**
 *
 * @author ayza
 */
public class AverageofArray {

    public static void main(String[] args) {

        int[] list = {4, 8, 15, 16, 23, 42};

        double sum = 0;
        for (double i : list) {
            sum += 1 / i;
        }
        double average = list.length / sum;
        System.out.println("Harmonic Mean\n" + average);
    }
}

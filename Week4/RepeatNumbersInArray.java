/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Week4;

import java.util.Arrays;

/**
 *
 * @author ayza
 */
public class RepeatNumbersInArray {
public static void main(String[] args) {
        int[] list = {1, 4, 2, 4, 78, 3, 3, 3, 3, 3, 7, 2, 89, 89, 78};
        StringBuilder print = new StringBuilder("Tekrar eden çift sayılar :");
        Arrays.sort(list);
        int tekrar = 0;
        int min = list[0];
        for (int j = 0; j < list.length; j++) {

            if (list[j] == min) {
                if (!(tekrar == min) && (list[j] % 2 == 0)) {
                    tekrar = min;
                    print.append(" ").append(tekrar);
                }
            }
            min = list[j];
        }
        System.out.println(print);
    }
}

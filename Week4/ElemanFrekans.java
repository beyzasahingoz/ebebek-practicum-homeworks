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
public class ElemanFrekans {

    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        frequency(arr);

    }

    public static void frequency(int arr[]) {
        int[] fr = new int[arr.length];
        int visited = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    //To avoid counting same element again  
                    fr[j] = visited;
                }
            }
            if (fr[i] != visited) {
                fr[i] = count;
            }
        }
        for (int i = 0; i < fr.length; i++) {
            if (fr[i] != visited) {
                System.out.println(arr[i] + " sayisi " + fr[i] + " kere tekrar edildi.");
            }
        }
    }

}

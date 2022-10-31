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
public class MatrisTranspoz {

    public static void main(String[] args) {
        int original[][] = {{1, 3, 4}, {2, 4, 3}, {3, 4, 5}};

        int transpose[][] = new int[original.length][original.length]; 

        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original.length; j++) {
                transpose[i][j] = original[j][i];
            }
        }

        System.out.println("Matris:");
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original.length; j++) {
                System.out.print(original[i][j] + " ");
            }
            System.out.println();//new line    
        }
        System.out.println("Transpoze:");
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original.length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}

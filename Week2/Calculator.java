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
public class Calculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNum = in.nextInt();
        System.out.println("Enter the second number:");
        int secondNum = in.nextInt();
        System.out.println("Select operator (+,-,*,/):");
        String operator = in.next();
        double result;
        switch (operator) {
            case "+":
                result = firstNum + secondNum;
                System.out.println("Result is: ");
                break;
            case "-":
                if (firstNum > secondNum) {
                    result = firstNum - secondNum;
                    System.out.println("Result is: " + result);
                    break;
                } else {
                    result = secondNum - firstNum;
                    System.out.println("Result is: " + result);
                    break;
                }
                
            case "*":
                result = firstNum * secondNum;
                System.out.println("Result is: " + result);
                break;
            case "/":
                if (firstNum > secondNum) {
                    result = firstNum / secondNum;
                    System.out.println("Result is: " + result);
                    break;
                } else {
                    result = secondNum / firstNum;
                    System.out.println("Result is: " + result);
                    break;
                }
            default:
                System.out.println("Wrong Choice!");
        }
    }
}

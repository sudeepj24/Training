//Write a program to add, subtract, multiply and divide two numbers using methods with
// parameters using only one class.

import java.util.Scanner;

public class p01 {
    public static void add(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    public static void sub(int a, int b) {
        int c = a - b;
        System.out.println(c);
    }

    public static void mul(int a, int b) {
        float c = a * b;
        System.out.println(c);
    }

    public static void div(int a, int b) {
        float c = a / b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Enter two numbers and operation number: ");
        for(int i=0; i++; i<2){
            sc
        }
        int op = sc.nextInt();

        switch (op) {
            case 1:
                add(num1, num2);
                break;

            case 2:
                sub(num1, num2);
                break;

            case 3:
                mul(num1, num2);
                break;

            case 4:
                div(num1, num2);
                break;

            default:
                System.out.println("Enter correct number");
                break;
        }
        sc.close();
    }
}
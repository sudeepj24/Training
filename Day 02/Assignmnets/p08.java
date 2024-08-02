//Write a program to calculate the sum of the first and the second 
//last digit of a 5 digit.
//E.g.- NUMBER : 12345        OUTPUT : 1+4=5 
//Input the number using scanner.

import java.util.Scanner;

public class p08 {
    static void sum(int num){
        int a = num/10000;
        int b = (num/10)%10;
        int sum = a + b;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sum(num);
        sc.close();
    }

    
}

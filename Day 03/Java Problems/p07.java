//Write a program to find greatest common divisor (GCD) or highest common factor (HCF) of given two numbers

import java.util.*;

public class p07 {
    
    public static void gcd(int a, int b){
        int c = Math.min(a,b);
        int d = Math.max(a,b);

        int gcdd = 1;
        for(int i = c; i>0;i--){
            if(c%i == 0 && d % i == 0){
                gcdd = i;
                break;
            }
        }
        System.out.println("GCD is: " + gcdd);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        gcd(num1, num2);
        sc.close();
    }

}

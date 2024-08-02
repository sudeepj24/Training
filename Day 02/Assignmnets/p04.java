//Input the marks of Robert in three subjects using Scanner (each out of 100 ), 
//write a program to calculate his total marks and percentage marks.

import java.util.Scanner;

public class p04 {
    
    public static void marks(int[] arr){
        int total = arr[0] + arr[1] + arr[2];
        int per = (total/300)*100;
        System.out.println(total);
        System.out.println(per);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        marks(arr);

        sc.close();
    }
}

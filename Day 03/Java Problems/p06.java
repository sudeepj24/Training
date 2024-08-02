// Take integer inputs from user until he/she presses q 
//( Ask to press q to quit after every integer input ). 
//Print average and product of all numbers.

import java.util.*;

public class p06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();
         while (sc.hasNextInt()) {
            int number = sc.nextInt();
            integers.add(number);
         }
        for(int num:integers)
        System.out.println(num);
        sc.close();
    }
}

//Write a program that takes your full name as input and displays the abbreviations of 
//the first and middle names except the last name which is displayed as it is. 
//For example, if your name is Robert Brett Roser, then the output should be R.B.Roser.

import java.util.*;

public class p02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");
        int n = words.length;
        String asnwer = "";
        for (int i = 0; i<= n - 2;i++ ){
            asnwer = asnwer + words[i].charAt(0)+".";
        }
        asnwer = asnwer + words[n-1];
        System.out.println(asnwer); 
        sc.close();    
    }

}

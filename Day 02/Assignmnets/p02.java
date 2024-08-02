//Write a program to calculate the perimeter of a triangle. 
//Input the sides of triangle using command Line arguments.

public class p02 {
    public static void peri(int a, int b, int c){
        
        int peri = a +b+c;

        System.out.println(peri);
    }

    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        peri(num1, num2, num3);
    }    
}

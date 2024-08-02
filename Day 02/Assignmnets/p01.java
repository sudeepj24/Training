// Write a program to calculate the area and perimeter of the rectangle. 
//Input Length and breadth using command line arguments.

public class p01{
    public static void area(int a, int b){
        int Area = a*b;
        int peri = 2*(a +b);

        System.out.println(Area);
        System.out.println(peri);
    }

    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        area(num1, num2);
    }
}
//In one project, create two classes. One class should contain only methods (add, subtract, multiply and divide). The other class should contain only the main() method which calls each of the methods from the previous class.


import java.util.Scanner;



class one {
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
}

public class p02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Enter operation number: ");
        int op = sc.nextInt();

        switch (op) {
            case 1:
                one.add(num1, num2);
                break;

            case 2:
                one.sub(num1, num2);
                break;

            case 3:
                one.mul(num1, num2);
                break;

            case 4:
                one.div(num1, num2);
                break;

            default:
                System.out.println("Enter correct number");
                break;
        }
        sc.close();
    }
}

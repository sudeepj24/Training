//Write a Program to input a number using command line arguments, multiply it
//by a number of your choice and display the result.
public class Mul {
	public static void sum(int a) {
		int b = a*7;
		System.out.println(b);
	}
	
	public static void main(String args[]) {
		int a = Integer.parseInt(args[0]);
		sum(a);
	}
}

package revature;

import java.util.*;

public class Calculator {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int Add = sum(num1, num2);
		int Sub = sub(num1, num2);
		int Mul = mul(num1, num2);
		int Div = div(num1, num2);
		
		System.out.println(Add);
		System.out.println(Sub);
		System.out.println(Mul);
		System.out.println(Div);
		sc.close();	
	}
	public int sum(int a, int b) {
		int result = a + b;
		
		return result;
	}
	
	public int sub(int a, int b) {
		int result = a - b;
		
		return result;
	}
	
	public int mul(int a, int b) {
		int result = a * b;
		
		return result;
	}
	
	public int div(int a, int b) {
		int result = a/b;
		
		return result;
	}
	
	
}

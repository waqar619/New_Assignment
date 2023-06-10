package exception.main;

import java.util.Scanner;

public class ArithmeticException {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number a");
		int a =sc.nextInt();
		System.out.println("Enter the number b");
		int b =sc.nextInt();
		try {
		double c = b/a;
		System.out.println("c is :"+ c);
		} catch (Exception e) {
			System.out.println("Hey you cannot divide b by zero");
		}



	}

}

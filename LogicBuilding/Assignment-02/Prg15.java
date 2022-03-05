package assignment2;

import java.util.Scanner;

public class Prg15 {

	public static void main(String[] args) {
		int num1,num2,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		num1 = sc.nextInt();
		System.out.println("Enter the second number");
		num2 = sc.nextInt();
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("num1"+num1);
		System.out.println("num2"+num2);
		sc.close();
		
		

	}

}

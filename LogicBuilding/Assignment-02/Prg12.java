package assignment2;
import java.util.Scanner;

public class Prg12 {

	public static void main(String[] args) {
		int num1,num2,num3;
		float avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		num1 = sc.nextInt();
		System.out.println("Enter the second number");
		num2 = sc.nextInt();
		System.out.println("Enter the third number");
		num3 = sc.nextInt();
		avg = (num1+num2+num3)/3;
		System.out.println(avg);
		sc.close();
	}

}

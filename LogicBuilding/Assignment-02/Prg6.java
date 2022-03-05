package assignment2;
import java.util.Scanner;

public class Prg6 {

	public static void main(String[] args) {
		int num1,num2,ans;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		num1 = sc.nextInt();
		System.out.println("Enter the second number");
		num2 = sc.nextInt();
		ans = num1+num2;
		System.out.println(ans);
		ans = num1-num2;
		System.out.println(ans);
		ans = num1*num2;
		System.out.println(ans);
		ans=num1/num2;
		System.out.println(ans);
		ans=num1%num2;
		System.out.println(ans);
		sc.close();

	}

}

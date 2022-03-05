package assignment2;

import java.util.Scanner;

public class Prg11 {

	public static void main(String[] args) {
		float radius;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius");
		radius = sc.nextFloat();
		float pi = 3.14f;
		float peri;
		float area;
		peri = 2*pi*radius;
		System.out.println(peri);
		area = pi*radius*radius;
		System.out.println(area);
		sc.close();
	}

}

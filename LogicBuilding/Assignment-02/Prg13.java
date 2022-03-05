package assignment2;

import java.util.Scanner;

public class Prg13 {

	public static void main(String[] args) {
		float peri,width,height;
		float area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the width");
		width = sc.nextFloat();
		System.out.println("Enter the height");
		height = sc.nextFloat();
		area = width*height;
		System.out.println(area);
		peri = 2*(width+height);
		System.out.println(peri);
		sc.close();

	}

}

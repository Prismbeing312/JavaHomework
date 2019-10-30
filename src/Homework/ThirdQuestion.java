package Homework;

import java.util.Scanner;

public class ThirdQuestion {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double koter = input.nextInt();
		double omek = input.nextInt();
		double r = koter/2;
		double kibolet = 3.14*(r*r);
		System.out.println("The Capacity is " + kibolet);

	}

}

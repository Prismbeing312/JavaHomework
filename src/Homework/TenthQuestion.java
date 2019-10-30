package Homework;

import java.util.Scanner;

public class TenthQuestion {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double num = input.nextDouble();
		int evenDig = (int)num/2*2+2;
		System.out.println("The number is "+evenDig);
		

	}

}

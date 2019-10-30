package Homework;

import java.util.Scanner;

public class FithQuestion {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int rightDig = num%10;
		System.out.println("The right digit is "+rightDig);
	}

}

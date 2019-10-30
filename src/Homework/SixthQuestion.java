package Homework;

import java.util.Scanner;

public class SixthQuestion {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int secondRight = num/10%10;
		System.out.println("Second right digit is "+secondRight);

	}

}

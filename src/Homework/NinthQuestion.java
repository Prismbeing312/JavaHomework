package Homework;

import java.util.Scanner;

public class NinthQuestion {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int dig1 = num%10;
		int dig2 = num/10;
		System.out.println("The new numer is "+dig1+dig2);

	}

}

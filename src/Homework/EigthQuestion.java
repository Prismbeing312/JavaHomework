package Homework;

import java.util.Scanner;

public class EigthQuestion {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int dig1 = num%10;
		int dig2 = num/10;
		int sum = dig1+dig2;
		System.out.println("The sum is "+sum);

	}

}

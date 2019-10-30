package Homework;

import java.util.Scanner;

public class FirstQuestion {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int sum = num1+num2+num3;
        int avg = sum/3;
        System.out.printf("The number are %d, %d and %d ",num1, num2, num3);
        System.out.println();
        System.out.printf("The sum is %d, and the average is %d", sum, avg);
        
        
	}

}
	
package Homework;

import java.util.Scanner;

public class FourthQuestion {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		int movieLeangth = input.nextInt();
		int min = movieLeangth%60;
		int hour = movieLeangth/60;
		System.out.printf("The Movie is %d hours and %d minutes", hour, min);

	}

}

package Homework;

import java.util.Scanner;

public class SecondQuestion {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		int leangth = input.nextInt();
		int width = input.nextInt();
		int Hekef = leangth*2 + width*2;
		int area = leangth*width;
		System.out.printf("The hekef is %d and the area is %d", Hekef, area);

	}

}

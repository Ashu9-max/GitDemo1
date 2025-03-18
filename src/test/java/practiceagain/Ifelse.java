package practiceagain;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the age");
		int a = reader.nextInt();
		
		
		if (a>=18 && a<=40) {
			System.out.println("Eligible to print");
		}
		else {
			System.out.println("Not eligible to print");
		}
	}

}

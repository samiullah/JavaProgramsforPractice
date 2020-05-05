package naveenAutomationPractice;

import java.util.Scanner;

public class getAsciiofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getAsciiofNumber obj = new getAsciiofNumber();
		System.out.println("Enter character for which you want ascii number");

		Scanner scan = new Scanner(System.in);
		char s = scan.next().charAt(0);

		System.out.println(obj.getAscii(s));

	}

	public int getAscii(char a) {

		int ascii = (int) a;
		return ascii;

	}

}

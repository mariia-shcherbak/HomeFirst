package Sixth;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Input miles, inches or yards: ");
		String str= new String();
		str=in.nextLine();
		System.out.print("Input a  number: ");
		double num= in.nextDouble();
		Sixth temp=new Sixth();
		temp.meter(num, str);

	}
}

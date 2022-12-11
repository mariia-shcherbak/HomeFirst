package Twelfth;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int[] arr= new int[]{1,67,2,0,-4,-10};
		Twelfth temp=new Twelfth();
		System.out.print("Sort from smallest to largest -true. Sorting from largest to smallest-false:");
		boolean dir=in.nextBoolean();
		temp.sort(arr, dir);
		in.close();
	}
}

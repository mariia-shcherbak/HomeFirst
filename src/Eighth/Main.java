package Eighth;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    	Eighth temp=new Eighth();
		System.out.print("First number -> ");
		int first=in.nextInt();
		System.out.print("Second number -> ");
		int second=in.nextInt();
		temp.table(first, second);
    }
}

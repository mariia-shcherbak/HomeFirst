package Third;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Input a first number: ");
		int first = in.nextInt();
		System.out.print("Input a second number: ");
		int second = in.nextInt();
		System.out.print("Input a third number: ");
		int third = in.nextInt();
		Third t = new Third();
		t.print(first, second, third);
		in.close();
	}
}

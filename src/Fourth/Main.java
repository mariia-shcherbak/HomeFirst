package Fourth;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

		System.out.print("Enter 6 digit number -> ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		Fourth temp=new Fourth();
		temp.num(num);
    }
}

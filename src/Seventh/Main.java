package Seventh;



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a first number -> ");
		int first = scanner.nextInt();
		System.out.print("Enter a second number -> ");
		int second = scanner.nextInt();
        Seventh temp=new Seventh();
		System.out.print(temp.mas(first, second));
    }
}

package Fifth;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    	Fifth temp=new Fifth();
		System.out.print("Number of month -> ");
		int mon=in.nextInt();
		temp.month(mon);
    }
}

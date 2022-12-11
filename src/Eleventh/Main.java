package Eleventh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Eleventh temp=new Eleventh();
        System.out.print("Enter the number of characters:");
        int count=in.nextInt();
        System.out.print("Enter character:");
        String letter=in.next();
        System.out.print("Choose a direction. true - to the side, false - to the bottom:");
        boolean dir=in.nextBoolean();
        temp.line(count, letter, dir);
    }
}

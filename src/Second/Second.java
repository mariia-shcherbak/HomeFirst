package Second;

import java.util.Scanner;

public class Second {
    public void Calc() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        double num = in.nextDouble();
        System.out.print("Input a percent: ");
        double per = in.nextDouble();
        in.close();
        double res=num*(per/100);
        System.out.println("Answer: "+res);
    }


}





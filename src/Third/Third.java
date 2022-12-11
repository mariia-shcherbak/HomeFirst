package Third;


import java.util.Scanner;

public class Third {
    public void print(int first, int second, int third){
        if((first>0)&&(second>=0)&&(third>=0)) {
            int res = first * 100 + second * 10 + third;
            System.out.println(res);
        }
        else{
            System.out.println("Error");
        }
    }
}



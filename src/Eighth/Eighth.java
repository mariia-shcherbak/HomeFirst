package Eighth;

public class Eighth {
    public void table(int first, int second){
        if(first>second){
            int temp=first;
            first=second;
            second=temp;
        }

        for (int i = first; i <=second; i++) {

            for (int j = 1; j < 11; j++) {

                System.out.print(i + "*" + j + "=" + i * j + ";\t");
            }

            System.out.print("\n");
        }
    }
}

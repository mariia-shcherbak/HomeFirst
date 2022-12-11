package Eleventh;

public class Eleventh {
    public void line(int count, String letter, boolean dir){
        if(count>0) {
            for (int i = 0; i < count; i++) {
                if (dir == true) {
                    System.out.print(letter);
                } else{
                    System.out.println(letter);
                }
            }
        }
        else{
            System.out.print("Error");
        }
    }
}

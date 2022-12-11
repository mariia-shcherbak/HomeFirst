package Seventh;

public class Seventh {
    public String mas(int first, int second){
        if(first>second){
            int temp=first;
            first=second;
            second=temp;
        }
        String str=new String();
        while (first<=second){
            if(first % 2 !=0)
            {
                str+=first;
                str+=" ";
            }
            first++;
        }
        return str;
    }
}

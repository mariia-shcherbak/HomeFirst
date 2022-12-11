package Sixth;

public class Sixth {

    public void meter(double num, String str){
        double res=0;
        if(str.compareTo("miles")==0){
            res=0.00062137*num;
            System.out.print("Miles:"+res);
        }
        else if(str.compareTo("inches")==0){
            res=39.3701*num;
            System.out.print("Inches:"+res);
        }
        else if(str.compareTo("yards")==0){
            res=1.09361*num;
            System.out.print("Yards:"+res);
        }
        else {
            System.out.print("Incorrectly entered measuring system");
        }
    }
}

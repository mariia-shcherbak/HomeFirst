package Fifth;

public class Fifth {
    public void month(int num){
        if(num>0&&num<13){
            if(num<6&&num>2){
                System.out.print("Spring");
            }
            else if(num<9&&num>5){
                System.out.print("Summer");
            }
            else if(num<12&&num>8){
                System.out.print("Autumn");
            }
            else {
                System.out.print("Winter");
            }
        }
        else{
            System.out.print("Error");
        }
    }
}

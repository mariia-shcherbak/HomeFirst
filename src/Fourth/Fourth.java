package Fourth;

public class Fourth {
    public  void num(int num){
        int one=0;
        int two=0;
        int thf=0;
        int five=0;
        int six=0;
        if (Math.ceil(Math.log10(num))==6) {
            six = num % 10;
            if(six!=0) {
                five = (num % 100) / 10;
                one = (num % 1000000) / 100000;
                two = (num % 100000) / 10000;
                thf = (num % 10000) / 100;
                System.out.println("Number: " + six + five + thf + two + one);
            }
            else{
                System.out.println("0 cannot be first");
            }
        }else System.out.println("Entered non-6 digit number");
    }
}

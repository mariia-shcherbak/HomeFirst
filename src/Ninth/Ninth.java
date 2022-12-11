package Ninth;

public class Ninth {
    public void mas(){
        int[] array = gen();

        int max = array[0];
        int min = array[0];
        int pos=0;
        int neg=0;
        int nul=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i]<min){
                min = array[i];
            }
            if(array[i]>0){
                pos++;
            }
            else if(array[i]<0){
                neg++;
            }
            else {
                nul++;
            }
        }
        System.out.print("Max:"+max+" Min:"+min+" Positive:"+pos+" Negative:"+neg+" Null:"+nul);
    }

    public int[] gen(){
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 51) - 15);
            System.out.print(array[i]+"\t");
        }
        System.out.print("\n");
        return array;
    }
}

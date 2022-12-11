package Tenth;

public class Tenth {

    public void mas(){
        int[] array=gen();
        int even = 0;
        int odd = 0;
        int pos=0;
        int neg=0;

        for (int i = 0; i < array.length; i++) {
            if ((array[i]%2==0)&&(array[i]!=0)) {
                even++;
            }
            else if(array[i]%2!=0){
                odd++;
            }
            if(array[i]>0){
                pos++;
            }
            else if(array[i]<0){
                neg++;
            }
        }
        int[] even_mas=new int[even];
        int[] odd_mas=new int[odd];
        int[] pos_mas=new int[pos];
        int[] neg_mas=new int[neg];
        int e=0;
        int o=0;
        int p=0;
        int n=0;
        for(int i=0; i<array.length; i++){
            if((array[i]%2==0)&&(array[i]!=0)){
                even_mas[e]=array[i];
                e++;
            }
            else if(array[i]%2!=0){
                odd_mas[o]=array[i];
                o++;
            }
            if(array[i]>0){
                pos_mas[p]=array[i];
                p++;
            }
            else if(array[i]<0){
                neg_mas[n]=array[i];
                n++;
            }
        }
        print(even_mas);
        print(odd_mas);
        print(pos_mas);
        print(neg_mas);

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

    public void print(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n");
    }
}

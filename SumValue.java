import java.util.Arrays;
import java.util.Random;

public class SumValue {
    static void generaterandomArray(int[] arr){
        Random random=new Random();

for(int i=0;i<arr.length;i++){
    arr[i]= (int) random.nextLong();

}
    }


static long sum (int[] arr) {
    int Sum = 0;
    for (int i = 0; i < arr.length; i++) {
        Sum = Sum + arr[i];
    }
    return Sum;
}
public static void main(String[] args){
    int[] arr=new int[4000000];
    generaterandomArray(arr);
   long sum=sum(arr);
    System.out.println("Sum:"+sum);
}}
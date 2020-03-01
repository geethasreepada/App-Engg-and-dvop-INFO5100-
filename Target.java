import java.util.ArrayList;
import java.util.Arrays;

public class Target {
    public static void main(String[] args){
        int target=5;
        int[] inputarray=new int[]{1,2,3,4};
        System.out.println(indexofclosest(inputarray,target));

    }
public static int indexofclosest(int[] arr, int target){
        int n=arr.length;
    int[] val=new int[n];


    for( int i=0;i<n;i++) {
        val[i] = target - arr[i];
    }
    int min=val[0];
    int index=0;

    for(int i=0;i<n;i++){


        if(val[i]<=min) {
                    min = val[i];
                    index=i;

                }

    }
    return index;

}


}




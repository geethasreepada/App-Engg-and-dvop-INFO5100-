import java.util.Random;

public class IndexOutOfBoundException extends RuntimeException{
    int LowerBound;
    int UpperBound;
    int index;
    public IndexOutOfBoundException(int current,int lower,int higher){
        this.index=current;
        this.LowerBound=lower;
        this.UpperBound=higher;

    }
   public String toString(){
       return "Error Message: Index: " + index + ", but Lower bound: " + this.LowerBound + ", Upper Bound: "
               + this.UpperBound;
   }
   public static void main(String[] args){
       //final int SIZE = 11;
       int[] nums = new int[10];
int size=nums.length;
       Random random = new Random();

       //System.out.println("Starting random access in an int array with size " + nums + " ...");
       while (true) {
           int i = random.nextInt(size + size / 2);
           try {
               //System.out.println("Try to access the number with index: " + i);
               if (i >= size)
                   throw new IndexOutOfBoundException(i, 0, size - 1);
               else
                   nums[i] = random.nextInt(size);
           } catch (Exception ex) {
               System.out.println(ex);
               return;
           }
       }
   }
}


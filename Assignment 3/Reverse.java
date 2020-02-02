public class Reverse {
    public static void main(String[] args){
        String str="My name is Geetha";
        String[] array= str.split(" ");

        for(int i=0;i<array.length;i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for(int i=array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }
    }
}

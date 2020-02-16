package com.company;

public class Sum {
    public static void main(String[] args){
    int num=3542;
    int Sum=TotalSum(num);
        System.out.println(Sum);
    }
    static int TotalSum(int num){
        if(num<9){
            return num;
        }
else if(num>9)   {
 num =num % 9;
}
return num;
    }
}
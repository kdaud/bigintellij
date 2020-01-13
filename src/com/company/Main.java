package com.company;

import java.math.BigInteger;

public class Main{
   // protected BigInteger number;
    private Integer num;

    public static void main(String[] args) {
       new Main().show();
    }
    public void show(){
        Number num = new BigInteger("65666");
        System.out.println(num);
        int number = 7;
        BigInteger factorials=factorial(number);
        System.out.println("The factorial of "+number+" is : "+factorials);
    }
    public BigInteger factorial(int N){
        BigInteger fact = BigInteger.ONE;
        for(int i=2; i<N;i++){
        fact =fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
}

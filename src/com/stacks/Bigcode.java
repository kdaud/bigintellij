package com.stacks;

import java.math.BigInteger;
import java.util.Scanner;

public class Bigcode {
    public void software(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        BigInteger a = new BigInteger(scanner.next());

        System.out.println("Enter the value of b:");
        BigInteger b = new BigInteger(scanner.next());

        System.out.println(a.add(b));
        System.out.println(b.multiply(a));
    }

}

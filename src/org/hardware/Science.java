package org.hardware;

import java.util.Scanner;

public class Science {
    private Scanner scanner = new Scanner(System.in);
    protected int mycall(){
        int [] marks = new int[4];
        for (int i = 0; i <marks.length ; i++) {
            System.out.println("Enter your marks: ");
            marks[i]= scanner.nextInt();
        }
        int sum =0;
        for(int xx : marks){
            sum +=xx;
        }
        return sum;
    }
}

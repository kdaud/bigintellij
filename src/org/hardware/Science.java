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
        int square=0;
        int sum = 0;
        for(int xx: marks){
            square =xx*xx;
            sum +=square;
        }
        return sum;
    }
    protected void software(){
        System.out.println("Enter the lower limit");
        int L =scanner.nextInt();
        System.out.println("Enter the upper limit:");
        int R = scanner.nextInt();
        for (int i=L; i<=R; i++){
            System.out.println(i);
        }
    }
    protected void softwareprogrammer(){
        System.out.println("Enter the size of the array");
        int x =scanner.nextInt();
        int [] marks = new int[x];
        int []grades= new int[x];
        int [] sum = new int[x];

        for (int i = 0; i <marks.length ; i++) {
            System.out.println("Enter your marks: ");
            marks[i]= scanner.nextInt();
        }

        for (int i = 0; i <grades.length ; i++) {
            System.out.println("Enter your grades: ");
            marks[i]= scanner.nextInt();
        }

        for(int h=0;h<marks.length-1;h++){
            for (int j=0; h<grades.length; h++){
                sum[h]=marks[h]+grades[h];
            }
        }
        for(int summation: sum){
            System.out.print(summation+" ");
        }
        System.out.println("Sum: "+sum[0]+sum[1]+sum[2]+sum[3]);
    }
}

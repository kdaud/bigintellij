package org.software;

import java.util.Random;
import java.util.Stack;
import java.util.regex.Matcher;

;import javax.print.attribute.PrintJobAttribute;

public class BigNote {
    protected Random mycodes(){
        Random obj = new Random();

        for(int i=20; i<25;i++){
            int xx = obj.nextInt(45);
            System.out.print(xx+" ");
        }
        System.out.println("\n");
        return obj;
    }
    public void engineer(){
        //Matcher matcher = ;
        int [] number={4,3,2,1,6,5};

        for(int g: number){
            System.out.println(number[g]);
        }
    }
    public void mystuff(){
        Stack<String> coders = new Stack<>();
        coders.push("Dansling");
        System.out.println(coders);
    }

}

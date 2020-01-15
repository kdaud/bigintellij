package org.software;

import java.util.Random;

import com.stacks.Bigcode;

public class MainTD {
    static final String MY_COUNTRY ="UGANDA";
    public static void main(String[] args) {
        BigNote objs = new BigNote();
        System.out.println(objs.mycodes());

//mysoftware();
    }
    public static void mysoftware(){
        Random obj = new Random();
        int ff = obj.nextInt();
        System.out.println(ff);
    }
}

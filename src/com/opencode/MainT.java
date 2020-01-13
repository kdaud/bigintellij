package com.opencode;

import javax.management.ConstructorParameters;

public class MainT {
    static {
        System.out.println("I Love this thing of coding and i want to be a software engineer some day");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * return the name
     */
    private String name;

    public static void main(String[] args) {
//        Mentors obj = new Mentors();
//        obj.table();
        Mentors obj = new Chilld();
        obj.table();
        System.out.println(mygrade());
    }
    public static String mygrade(){
        return "Mysql is loading";
    }
    //my idea is really interesting to write codes
}

package com.company;

import com.source.MyTester;

public class Tester {
    public static void main(String[] args) {
        MyTester obj =  new MyTester();
        obj.setName("Daud Kakumirizi");
        obj.setCompany("JabRef Organisation");
        obj.setExperience("3 Years");
        System.out.println(obj.toString());

    }
}

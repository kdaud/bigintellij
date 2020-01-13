package com.source;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import com.company.Tester;

public class Que extends Codes {
Queue<String> mylist = new LinkedList<>();
    @Override
    public void soft() {
mylist.add("Daud");
mylist.add("John");
mylist.add("Aaron");
mylist.add("Henry");

        for (String ss:mylist
             ) {
            System.out.println(ss);
        }
    }

    public static void main(String[] args) {
        new Que().soft();
    }
}

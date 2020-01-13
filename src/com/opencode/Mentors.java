package com.opencode;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Mentors implements Codes{
         private Queue<String> obj = new LinkedList<>();
    @Override
    public void table() {
        System.out.println(obj.isEmpty());
        obj.add("Students");
        obj.add("Lecturer");
        obj.add("Tester");
        obj.add("Coder");
        System.out.println(obj.isEmpty());
        System.out.println(obj.offer("Programmer"));
        System.out.println(obj.offer("QA Engineer"));
        System.out.println(obj.element());
                  for(String ss: obj){
                      System.out.print(ss+" ");
                  }
        System.out.println();
        System.out.println(obj.peek());

        System.out.println("HELLO PROGRAMMERS OUT THERE WHO ARE CODING");

    }
}

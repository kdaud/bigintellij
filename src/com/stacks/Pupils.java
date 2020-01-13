package com.stacks;

import java.util.Stack;

public class Pupils {
    private Stack<String> students = new Stack<>();
    public void mycall(){
        students.push("Gama");
        students.push("Godfrey");
        students.push("Cliff");
        students.push("Aaron");
    for(String ss: students){
        System.out.println(ss);
    }
    }
}

package com.stacks;

import java.util.Stack;

public class Pupils {
    private Stack<String> students = new Stack<>();
    public void mycall(){
        System.out.println(students.empty());

        students.push("Gama");
        students.push("Godfrey");
        students.push("Cliff");
        students.push("Aaron");
        students.push("Gama");
        students.push("Geofrey");
        students.push("Clifford");
        students.push("Aamon");
        students.push("Richard");
        students.push("Linda");
        students.push("Coder");
        students.push("Ivan");
        students.push("Gama");
        students.push("Godfrey");
        students.push("Cliff");
        students.push("Aaron");
        students.push("Gama");
        students.push("Geofrey");
        students.push("Clifford");
        students.push("Aamon");
        students.push("Richard");
        students.push("Linda");
        students.push("Coder");
        students.push("Ivan");
        students.push("Gama");
        students.push("Godfrey");
        students.push("Cliff");
        students.push("Aaron");
        students.push("Gama");
        students.push("Geofrey");
        students.push("Clifford");
        students.push("Aamon");
        students.push("Richard");
        students.push("Linda");
        students.push("Coder");
        students.push("Ivan");
        students.push("Gama");
        students.push("Godfrey");
        students.push("Cliff");
        students.push("Aaron");
        students.push("Gama");
        students.push("Geofrey");
        students.push("Clifford");
        students.push("Aamon");
        students.push("Richard");
        students.push("Linda");
        students.push("Coder");
        students.push("Ivan");
        System.out.println("--------");
        System.out.println(students.capacity());
        System.out.println(students.peek());
        System.out.println(students.size());
        System.out.println(students.search(2));
    for(String ss: students){
        System.out.print(ss+" ");
    }
    }
}

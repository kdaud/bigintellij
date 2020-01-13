package com.company;

import com.source.Language;
import com.source.MyTester;
import com.source.Que;

public class Tester {
    public static void main(String[] args) {
new Tester().running();
new Tester().software();
new Que().soft();
    }
        public void wizzards() {
            MyTester obj = new MyTester();
            obj.setName("Daud Kakumirizi");
            obj.setCompany("JabRef Organisation");
            obj.setExperience("3 Years");
            System.out.println(obj.toString());
        }
        public void running(){
            Language obj = new Language() {
                @Override
                public void show() {
                    System.out.println("From Interface page");
                }

                @Override
                public void mycode() {

                }
            };
        }
        public void software(){
        Coder obj = new Coder();
        obj.mycode();
        obj.show();
        }
    }


package com.company;

import com.source.Language;

public class Coder implements Language {
    @Override
    public void show() {
        System.out.println("Am a junior programmer");
    }

    @Override
    public void mycode() {
        System.out.println("Am programming! Am just determined to code");
    }
}

package org.software;

import java.util.Random;

;

public class BigNote {
    protected Random mycodes(){
        Random obj = new Random();
        int xx = obj.nextInt(45);
        for(int i=15; i<23;i++){
            System.out.println(xx);
        }
        return  obj;
    }

}

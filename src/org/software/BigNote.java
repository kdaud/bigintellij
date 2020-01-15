package org.software;

import java.util.Random;

;

public class BigNote {
    protected Random mycodes(){
        Random obj = new Random();

        for(int i=20; i<25;i++){
            int xx = obj.nextInt(45);
            System.out.print(xx+" ");
        }
        System.out.println("\n");
        return obj;
    }

}

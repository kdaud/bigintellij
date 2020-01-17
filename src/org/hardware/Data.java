package org.hardware;

import java.net.URL;
import java.util.Random;
//import com.google.*

public class Data {
    //public static URL
    //private static EventBus event = new EventBus();
    protected double mycodes(){
        Random random = new Random();
        double coding=random.nextGaussian();
        return coding;
    }


}

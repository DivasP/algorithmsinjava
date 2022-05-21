package com.learningsimplified.algorithmsinjava.datastrucuture2;

import java.util.HashMap;
import java.util.Map;

/**
 * Let's look at hashing and hash maps in particular in Java.
 */
public class Hashing {

    Map<Integer,String> nameMap = new HashMap<>();

    public void operations(){
        nameMap.put(1, "Divas");
        nameMap.put(17, "pandey");
        System.out.println("the value of namemap"+nameMap.get(1));
    }


}

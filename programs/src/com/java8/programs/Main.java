package com.java8.programs;


import java.io.FileInputStream;
import java.util.Arrays;
import java.util.List;

public class Main{
    static List<Integer> list;
    static {
        list = Arrays.asList(1,3,5,4,7,8,10,23,24,18,19,26);

        
    }

    public static void main(String[] args) {
	  System.out.println(Programs.getListOfEvenNumberByStream(list));
      System.out.println(Programs.getNumStartWithOne(list));
   //  int i=   list.stream().reduce((a,b) -> a < b).get();

       // FileInputStream
    }
}

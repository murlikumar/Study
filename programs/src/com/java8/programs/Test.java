package com.java8.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {

        //emove Nth smallest numberUse appropriate collection, add all these numbers in collection and remove the Nth smallest number:
        //99,345,2,12,24,12,275
       // Integer[] intarry= {99,345,2,12,24,12,275};
        List<Integer> list= new ArrayList();
        list.add(99);
        list.add(345);
        list.add(2);
        list.add(12);
        list.add(24);
        list.add(275);
        list.add(12);
        int n = 1;
        //getSmallestNumber(list,n);



    }

  /*static  int getSmallestNumber(List<Integer> list,int index){

      Stream<Integer> intStream =  list.stream().sorted();
      intStream.forEach(i1 -> System.out.println(i1));

      return IntStream.range(0, list.size())
              .filter(i -> i != index)
              .map(i -> list.get(i))
              .toArray();
  }

      return intVal;

    }*/
}

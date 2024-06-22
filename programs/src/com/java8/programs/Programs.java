package com.java8.programs;

import java.util.List;
import java.util.stream.Collectors;

public class Programs {


    /**
     * This method Given a list of integers, find out all the even numbers exist in the list using Stream functions?
     * @param integerList
     * @return listOfEvenNumber
     */
    public static List<Integer> getListOfEvenNumberByStream(List<Integer> integerList){
        List<Integer> listOfEvenNumber= integerList.stream().filter(i -> i%2 ==0 ).collect(Collectors.toList());

        return listOfEvenNumber;
    }

    /**
     * Given a list of integers, find out all the numbers starting with 1 using Stream functions?
     * @param integerList
     * @return
     */
    public static List<Integer> getNumStartWithOne(List<Integer> integerList){
        List<Integer> listOfNumStartWith1= integerList.stream().map(s-> s+"").filter(s -> s.startsWith("1")).map(s -> Integer.parseInt(s)).collect(Collectors.toList());

        return listOfNumStartWith1;
    }

}

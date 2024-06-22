package com.java8.programs;

import java.util.Arrays;
import java.util.List;

public class MyClass {


        public static void main(String args[]) {
            Integer[] arr1={1,2,3,4,5};
            Integer[] arr2 ={6,7,8,9};

            Integer[] arr3={1,2,3,4,5,6,7,8,9};

            List<Integer> list1 = Arrays.asList(arr1);
            List<Integer> list2 = Arrays.asList(arr2);

            for(int i =0 ;i<list2.size(); i++){
                list1.add(list2.get(i));
            }

            System.out.println("list1 = " + list1);
        }
    }

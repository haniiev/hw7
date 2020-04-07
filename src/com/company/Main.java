package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(10);
        list.add(12);
        list.add(25);
        list.add(40);
        list.add(50);
        List<Integer> secondList = new ArrayList<>();
        for (Integer s : list){
            if(s>5)
                secondList.add(s);
           System.out.println(secondList.toString());
        }
        for (Integer t : list){
            if(t<5)
                list.remove(t);
            System.out.println(list.toString());
        }
        list.add( 1,  2);
        list.add( -3,  8);
        list.add( -4,  5);
        System.out.println(list.toString());

        Collections.sort(list);
        System.out.println(list);

    }
}

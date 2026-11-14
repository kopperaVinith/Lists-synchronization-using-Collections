package com.codegnan.app.javaapp45.program;

import java.util.*;

import static java.lang.System.out;

public class MainProgram2 {
    public static void main(String[] args) {
        //List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
        Set<Integer> set = Set.of(1,2,3,4,5,6,7,8,9);
        Map<String, Integer> map = Map.of("A" ,1,"B", 2,"C", 3 );
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        list.remove(2);

        out.println(list);
        out.println(set);
        out.println(map);

        List<Integer> immuteableList = Collections.unmodifiableList(list);

        immuteableList.add(1);
       // out.println(list);
    }
}

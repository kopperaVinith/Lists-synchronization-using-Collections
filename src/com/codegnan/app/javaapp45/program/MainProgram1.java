package com.codegnan.app.javaapp45.program;

import com.codegnan.app.javaapp45.thread.CounterAThread;
import com.codegnan.app.javaapp45.thread.CounterBThread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.System.out;

public class MainProgram1 {
    public static void main(String[] args) {
        List<Integer> tokenNumberList = new ArrayList<>();
        List<Integer> synchronizedNumbersList = Collections.synchronizedList(tokenNumberList);

        /*CounterAThread counterAThread = new CounterAThread(tokenNumberList);
        CounterBThread counterBThread = new CounterBThread(tokenNumberList);*/

        CounterAThread counterAThread = new CounterAThread(synchronizedNumbersList);
        CounterBThread counterBThread = new CounterBThread(synchronizedNumbersList);

        counterAThread.start();
        counterBThread.start();

        try {
            counterAThread.join();
            counterBThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        out.println("No. of tokens generated: " + tokenNumberList.size());
        out.println("Token numbers: " + tokenNumberList);

        Collections.sort(tokenNumberList);
        out.println("Sorting list: " + tokenNumberList);

        Collections.reverse(tokenNumberList);
        out.println("Reverse list: " + tokenNumberList);

        Collections.shuffle(tokenNumberList);
        out.println("Shuffle list: " + tokenNumberList);

        Collections.shuffle(tokenNumberList);
        out.println("Shuffle list: " + tokenNumberList);

        Collections.shuffle(tokenNumberList);
        out.println("Shuffle list: " + tokenNumberList);

    }
}

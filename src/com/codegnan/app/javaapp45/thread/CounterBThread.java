package com.codegnan.app.javaapp45.thread;

import java.util.List;

public class CounterBThread extends Thread {
    private List<Integer> tokenNumbers;


    public CounterBThread(List<Integer> tokenNumbers) {
        this.tokenNumbers = tokenNumbers;
    }

    @Override
    public void run() {
        for(int tokenNumber = 11; tokenNumber <= 20; tokenNumber++) {
            tokenNumbers.add(tokenNumber);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

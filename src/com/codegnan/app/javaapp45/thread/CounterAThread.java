package com.codegnan.app.javaapp45.thread;

import java.util.List;

public class CounterAThread extends Thread {
    private List<Integer> tokenNumbers;



    public CounterAThread(List<Integer> tokenNumbers) {
        this.tokenNumbers = tokenNumbers;
    }

    @Override
    public void run() {
        for(int tokenNumber = 1; tokenNumber <= 10; tokenNumber++) {
            tokenNumbers.add(tokenNumber);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

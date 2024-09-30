package com.lab4.api.memory_optimization;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class OptimalSingleton {
    public void print(){
        var thread = new Thread(
            new Runnable() {
            public void run(){
                try {
                    BufferedWriter bufferedReader = new BufferedWriter(new FileWriter("hell.txt"));
                    bufferedReader.write("leaking memory");
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                }
            
        });

        thread.start();
        
    }

}

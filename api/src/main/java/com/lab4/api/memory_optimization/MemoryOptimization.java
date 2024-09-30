package com.lab4.api.memory_optimization;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.ArrayList;

public class MemoryOptimization {
    static Logger  logger = LoggerFactory.getLogger(MemoryOptimization.class);
    public static void main(String[] args) {
        var movieQuoteService = new MovieQuoteService();

        for(;;){
            User user = UserGenerator.generateUser();
        
            logger.debug("{} logged in", user.getName());
            user.subscribe(movieQuoteService);
            logger.debug("{} logged out", user.getName());
        }
    }

    private static void recursivePrint(){

        var op = new OptimalSingleton();
       
        op.print();
        
    }

    public static class MovieQuoteService{
        private String quote;
        List<User> users = new ArrayList<>();
    }
}

package com.lab4.api.performance_profilling;


public class Application {
    public static final String NUMBER_OF_CPU_CYCLES = "buggyApp.CPUCycles";
	
	public static void start() throws InterruptedException {
		
		// int noOfCycles = 6;
		
		// if (StringUtils.isValid(System.getProperty(NUMBER_OF_CPU_CYCLES))) {
		// 	try {
		// 		noOfCycles = Integer.parseInt(System.getProperty(NUMBER_OF_CPU_CYCLES));
		// 	} catch (NumberFormatException e) {
		// 		System.out.println("Failed to parse buggyApp.CPUCycles");
		// 	}
		// }
		
		// int counter = 0;
		
		while (true) {
			
			new CPUSpikerThread().start();
			Thread.sleep((2 * 60 * 1000));
		
		}
		/*
		 * new CPUSpikerThread().start(); new CPUSpikerThread().start(); new
		 * CPUSpikerThread().start(); new CPUSpikerThread().start(); new
		 * CPUSpikerThread().start(); new CPUSpikerThread().start();
		 */
		// System.out.println(noOfCycles + " threads launched!");
	}
	
	public static void stop() {
		
		new CPUSpikerThread().stop();
		System.out.println("CPU spike terminated!");
	}

    public static void main(String[] args) {
        try {
            start();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}


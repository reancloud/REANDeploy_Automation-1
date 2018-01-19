package com.opex.test.module;

public abstract class SleepFunctionality {
	
	
	public static void sleepTime(){
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
public static void sleepTime(long millis){
		
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
	/*public static void Output(){
		
		try {
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("This is test output");
	}*/

}
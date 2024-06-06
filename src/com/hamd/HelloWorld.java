package com.hamd;

import java.util.Scanner;

public class HelloWorld {
	/**
	 * Main Method
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("please enter your name");
		String name = input.nextLine();
		System.out.println("please enter a greeting");
		String greeting = input.nextLine();
		
		// display the greeting
		String greetMessage = generateGreeting(greeting,name);
		System.out.println(greetMessage);
	}
	
	/**
	 * creates a greeting using a custom greeting and name
	 * @param greeting - what greeting to use
	 * @param name - who to greet
	 * @return the greeting
	 */
	public static String generateGreeting(String greeting, String name) {
		return greeting + " , " + name;
	
	}
}

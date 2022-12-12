package com.miniproject;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		System.out.println("************** Welcome to Quiz Competation ***************");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student Name : ");
		String name = sc.next();

		System.out.println(" Press * to start the competation");
		String start = sc.next();
		System.out.println("                 Start Quiz Competation                   ");
		System.out.println("----------------------------------------------------------");

		Quiz q = new Quiz();
		q.getQuizTest(name);

	}

}

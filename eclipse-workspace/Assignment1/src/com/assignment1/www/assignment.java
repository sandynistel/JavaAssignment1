package com.assignment1.www;

import java.util.Scanner;

public class assignment {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner (System.in);
		/*
		//Java program to print all natural numbers from 1 to n using for loop. 
		System.out.println("Enter a number to show the numbers until: ");
		int numberSelected = userInput.nextInt();
		
		for (int i = 0; i<= numberSelected; i++) {
			System.out.println(i);
		}
		
		//Java program to print all even numbers between 1 to 100 using for loop. 
		System.out.println("Showing Even numbers until 100");
		
		for (int j = 0; j <= 100; j++) {
			if (j%2 == 0) {
				System.out.println(j + "\t");
			}
		}
		
		//Java program to print all odd number between 1 to 100 using for loop.
		System.out.println("Showing Odd numbers until 100");
		
		for (int j = 0; j <= 100; j++) {
			if (j%2 != 0) {
				System.out.println(j + "\t");
			}
		}
		
		//Java program to print sum of all even numbers between 1 to n using for loop
		System.out.println("Enter a number to sum up until: ");
		int evenAdd = userInput.nextInt();
		
		int[] storeNumber = new int[evenAdd];
		
		for (int k = 0; k < evenAdd; k++) {
			
			if (k % 2 == 0) {
				storeNumber[k] = k;
				System.out.println(storeNumber[k]);
			}
		}
		
		int sum = 0;
		for (int add : storeNumber) {
			sum += add;
		}
		
		System.out.println("Sum: " + sum);
		
		
		
		//Java program to print sum of all odd numbers between 1 to n using for loop.
		
		System.out.println("Enter a number to sum up until: ");
		int oddAdd = userInput.nextInt();
		
		int storeNumber[] = new int[oddAdd];
		
		for (int g = 0; g < oddAdd; g++) {
			
			if (g % 2 != 0) {
				storeNumber[g] = g;
				System.out.println(storeNumber[g]);
			}
		}
		
		int sumOdd = 0;
		for (int oddSum: storeNumber) {
			sumOdd+=oddSum;
		}
		
		System.out.println("Sum of Odd Numbers: " + sumOdd);
		
		
		
		//Java program to print multiplication of any number using for loop. 
		System.out.println("Enter the number to print multiplication of: ");
		int selectedNumber = userInput.nextInt();
		int mulNumber = 10;
		
		for (int i = 0; i <= mulNumber; i++ ) {
			int output = selectedNumber * i;
			System.out.println(selectedNumber + " * " + i + " = " + output);
		}
		
		
		//Java program to count the digits of a given number using for loop.
		System.out.println("Enter the number");
		int countNumber = userInput.nextInt();
		String numberCount = String.valueOf(countNumber);
		int count = 0;
		
		for (int i = 1; i<=numberCount.length(); i++) {
			count++;
		}
		System.out.println(count);
		
		
		
		//Java program to print the sum of digits of a given number using for loop.
		System.out.println("Enter the number: ");
		int num = userInput.nextInt();
		
		String numString = String.valueOf(num);
		int addNumber = 0;
		
		
		for (int i = 0; i<numString.length(); i++) {
			char ch = numString.charAt(i);
			int convertCh = ch - '0';
			addNumber = addNumber + convertCh;
		}
		
		System.out.println(addNumber);
		
		
		
		//Java program to print all natural numbers in reverse order using for loop. 
		System.out.println("Enter Number ");
		int numDisplay = userInput.nextInt();
		
		for (int i=numDisplay; i>=0; i--) {
			System.out.println(i);
		}
		*/
		
		//Java program to check whether a given number is Prime or not using for loop
		System.out.println("Enter a number to check if its a prime number: ");
		int primeNumber = userInput.nextInt();
		boolean isPrime = true;
		
		if (primeNumber <= 1 ) {
			System.out.println("A prime number must be greater than 1");
			} else {
				for (int i=2; i<primeNumber; i++) {
					if (primeNumber % i == 0) {
						isPrime = false;
						break;
				}
			}
				
		}
		
		if (isPrime) {
			System.out.println("The number " + primeNumber + " is a prime number ");
		}else {
			System.out.println("The number " + primeNumber + " is NOT a prime number ");
		}
		
		
		
	
		
	}

}

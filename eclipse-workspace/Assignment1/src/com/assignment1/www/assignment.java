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
		
		
		
		//Java program to check a given number is Armstrong or not using for loop.
		  

	        System.out.print("Enter a number: ");
	        int number = userInput.nextInt();

	        int originalNumber = number;
	        int temp = number;
	        int digits = 0;
	        int sum = 0;

	        
	        while (temp != 0) {
	            digits++;
	            temp = temp / 10;
	        }

	        temp = number;

	        
	        for (; temp != 0; temp = temp / 10) {

	            int digit = temp % 10;
	            int power = 1;

	            // Calculate digit^digits
	            for (int i = 1; i <= digits; i++) {
	                power = power * digit;
	            }

	            sum = sum + power;
	        }

	        // Check Armstrong
	        if (sum == originalNumber) {
	            System.out.println(originalNumber + " is an Armstrong number.");
	        } else {
	            System.out.println(originalNumber + " is NOT an Armstrong number.");
	        }

	        
		
		//Java program to print all Armstrong numbers between 1 to n using for loop
		 System.out.print("Enter the value of n: ");
	        int n = userInput.nextInt();

	        System.out.println("Armstrong numbers between 1 and " + n + " are:");

	        // Loop through numbers from 1 to n
	        for (int num = 1; num <= n; num++) {

	            int originalNumber = num;
	            int temp = num;
	            int digits = 0;
	            int sum = 0;

	            // Count digits
	            while (temp != 0) {
	                digits++;
	                temp = temp / 10;
	            }

	            temp = num;

	            // Calculate Armstrong sum
	            while (temp != 0) {

	                int digit = temp % 10;
	                int power = 1;

	                // Calculate digit^digits using for loop
	                for (int i = 1; i <= digits; i++) {
	                    power = power * digit;
	                }

	                sum = sum + power;
	                temp = temp / 10;
	            }

	            // Check Armstrong number
	            if (sum == originalNumber) {
	                System.out.println(originalNumber);
	            }
	        }
	        
	        //Java program to check a given number is Perfect or not using for loop
	        System.out.print("Enter a number: ");
	        int number = userInput.nextInt();

	        int sum = 0;

	        // Find divisors using for loop
	        for (int i = 1; i < number; i++) {

	            if (number % i == 0) {
	                sum = sum + i;
	            }
	        }

	        // Check perfect number
	        if (sum == number) {
	            System.out.println(number + " is a Perfect Number.");
	        } else {
	            System.out.println(number + " is NOT a Perfect Number.");
	        }
	        
	        
		
			//Java program to check all Perfect numbers between 1 to n using for loop
			System.out.print("Enter the value of n: ");
	        int n = userInput.nextInt();
	
	        System.out.println("Perfect numbers between 1 and " + n + " are:");
	
	        // Loop through numbers from 1 to n
	        for (int num = 1; num <= n; num++) {
	
	            int sum = 0;
	
	            // Find divisors of num
	            for (int i = 1; i < num; i++) {
	
	                if (num % i == 0) {
	                    sum = sum + i;
	                }
	            }
	
	            // Check perfect number
	            if (sum == num) {
	                System.out.println(num);
	            }
	        }

		
		
		//Java program to check a given number is Strong number or not using for loop.
		 System.out.print("Enter a number: ");
	        int number = userInput.nextInt();

	        int originalNumber = number;
	        int sum = 0;

	        // Process each digit
	        for (; number != 0; number = number / 10) {

	            int digit = number % 10;
	            int factorial = 1;

	            // Calculate factorial using for loop
	            for (int i = 1; i <= digit; i++) {
	                factorial = factorial * i;
	            }

	            sum = sum + factorial;
	        }

	        // Check Strong number
	        if (sum == originalNumber) {
	            System.out.println(originalNumber + " is a Strong Number.");
	        } else {
	            System.out.println(originalNumber + " is NOT a Strong Number.");
	        }
		
		
		
		//Java program to print all Strong numbers between 1 to n using for loop
		System.out.print("Enter the value of n: ");
        int n = userInput.nextInt();

        System.out.println("Strong numbers between 1 and " + n + " are:");

        // Loop through numbers from 1 to n
        for (int num = 1; num <= n; num++) {

            int originalNumber = num;
            int temp = num;
            int sum = 0;

            // Find factorial sum of digits
            while (temp != 0) {

                int digit = temp % 10;
                int factorial = 1;

                // Calculate factorial using for loop
                for (int i = 1; i <= digit; i++) {
                    factorial = factorial * i;
                }

                sum = sum + factorial;
                temp = temp / 10;
            }

            // Check Strong number
            if (sum == originalNumber) {
                System.out.println(originalNumber);
            }
        }
        
        
		
		//Write a program in Java to swap first and last digit of number using for loop.
		System.out.print("Enter a number: ");
        int number = userInput.nextInt();

        int originalNumber = number;

        // Find last digit
        int lastDigit = number % 10;

        // Find first digit and count digits
        int firstDigit = 0;
        int digits = 0;

        for (; number != 0; number = number / 10) {
            firstDigit = number % 10;
            digits++;
        }

        // Calculate power of 10
        int power = 1;

        for (int i = 1; i < digits; i++) {
            power = power * 10;
        }

        // Remove first and last digit
        int middleNumber = (originalNumber % power) / 10;

        // Swap first and last digit
        int swappedNumber =
                (lastDigit * power) + (middleNumber * 10) + firstDigit;

        System.out.println("Number after swapping first and last digit: "
                + swappedNumber);

		*/
		
		//Java program to swap values using third variable using for loop.
		  System.out.print("Enter first number: ");
	        int a = userInput.nextInt();

	        System.out.print("Enter second number: ");
	        int b = userInput.nextInt();

	        System.out.println("Before Swapping:");
	        System.out.println("a = " + a);
	        System.out.println("b = " + b);

	        // Swapping using third variable with for loop
	        for (int i = 1; i <= 1; i++) {

	            int temp = a;
	            a = b;
	            b = temp;
	        }

	        System.out.println("After Swapping:");
	        System.out.println("a = " + a);
	        System.out.println("b = " + b);
		
		
	
		
	}

}

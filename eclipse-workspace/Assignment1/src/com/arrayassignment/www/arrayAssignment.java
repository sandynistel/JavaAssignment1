package com.arrayassignment.www;

import java.util.Scanner;

public class arrayAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		/*
		//Write a Java program to calculate the average value of array
		System.out.print("Enter the size of array: ");
        int size = input.nextInt();

        int[] arr = new int[size];
        int sum = 0;

        // Input array elements
        System.out.println("Enter array elements:");

        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        // Calculate sum
        for (int i = 0; i < size; i++) {
            sum = sum + arr[i];
        }

        // Calculate average
        double average = (double) sum / size;

        System.out.println("Average value of array = " + average);
        
      
		
		//Write a Java program to test if an array contains a specific value
		System.out.print("Enter size of array: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        // Input array elements
        System.out.println("Enter array elements:");

        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        // Enter value to search
        System.out.print("Enter value to search: ");
        int searchValue = input.nextInt();

        boolean found = false;

        // Check if value exists in array
        for (int i = 0; i < size; i++) {

            if (arr[i] == searchValue) {
                found = true;
                break;
            }
        }

        // Display result
        if (found) {
            System.out.println(searchValue + " is present in the array.");
        } else {
            System.out.println(searchValue + " is NOT present in the array.");
        }
          
		
		// Write a Java program to find the index of an array element
		System.out.print("Enter size of array: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        // Input array elements
        System.out.println("Enter array elements:");

        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        // Enter value to find index
        System.out.print("Enter element to find index: ");
        int searchElement = input.nextInt();

        int index = -1;

        // Find index of element
        for (int i = 0; i < size; i++) {

            if (arr[i] == searchElement) {
                index = i;
                break;
            }
        }

        // Display result
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
        
		
		
		//Write a Java program to remove a specific element from an array
		System.out.print("Enter size of array: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        // Input array elements
        System.out.println("Enter array elements:");

        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        // Enter element to remove
        System.out.print("Enter element to remove: ");
        int removeElement = input.nextInt();

        int index = -1;

        // Find index of element
        for (int i = 0; i < size; i++) {

            if (arr[i] == removeElement) {
                index = i;
                break;
            }
        }

        // Remove element by shifting
        if (index != -1) {

            for (int i = index; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }

            System.out.println("Array after removing element:");

            for (int i = 0; i < size - 1; i++) {
                System.out.print(arr[i] + " ");
            }

        } else {
            System.out.println("Element not found in the array.");
        }
        
        
		
		//Write a Java program to find the maximum and minimum value of an array
		 int[] numbers = {45, 12, 78, 3, 90, 27, 65};

	        // Assume first element is max and min
	        int max = numbers[0];
	        int min = numbers[0];

	        // Find maximum and minimum
	        for (int i = 1; i < numbers.length; i++) {

	            if (numbers[i] > max) {
	                max = numbers[i];
	            }

	            if (numbers[i] < min) {
	                min = numbers[i];
	            }
	        }

	        // Print array elements
	        System.out.println("Array Elements:");

	        for (int i = 0; i < numbers.length; i++) {
	            System.out.print(numbers[i] + " ");
	        }

	        System.out.println("\n");

	        // Print max and min
	        System.out.println("Maximum value = " + max);
	        System.out.println("Minimum value = " + min);
		
			
		
		//Write a Java program to reverse an array of integer values
		 int[] numbers = {10, 20, 30, 40, 50};

	        System.out.println("Original Array:");

	        for (int i = 0; i < numbers.length; i++) {
	            System.out.print(numbers[i] + " ");
	        }

	        System.out.println("\n");

	        System.out.println("Reversed Array:");

	        // Print array in reverse order
	        for (int i = numbers.length - 1; i >= 0; i--) {
	            System.out.print(numbers[i] + " ");
	        }
	        
	       
		
		//Write a Java program to find the duplicate values of an array of integer values
		 int[] numbers = {10, 20, 30, 20, 40, 50, 10, 60};

	        System.out.println("Duplicate values in the array are:");

	        // Find duplicate values
	        for (int i = 0; i < numbers.length; i++) {

	            for (int j = i + 1; j < numbers.length; j++) {

	                if (numbers[i] == numbers[j]) {
	                    System.out.println(numbers[i]);
	                }
	            }
	        }
	        
	      
		
		//Write a Java program to find the common elements between two arrays (string values)
		 String[] array1 = {"Java", "Python", "C++", "JavaScript"};
	     String[] array2 = {"Python", "C#", "Java", "PHP"};

	        System.out.println("Common elements between two arrays are:");

	        // Find common elements
	        for (int i = 0; i < array1.length; i++) {

	            for (int j = 0; j < array2.length; j++) {

	                if (array1[i].equals(array2[j])) {
	                    System.out.println(array1[i]);
	                }
	            }
	        }
	        
	       
		
		//Write a Java program to remove duplicate elements from an array
		 int[] numbers = {10, 20, 30, 20, 40, 10, 50};

	        System.out.println("Array after removing duplicate elements:");

	        // Remove duplicates
	        for (int i = 0; i < numbers.length; i++) {

	            boolean isDuplicate = false;

	            for (int j = 0; j < i; j++) {

	                if (numbers[i] == numbers[j]) {
	                    isDuplicate = true;
	                    break;
	                }
	            }

	            // Print only unique elements
	            if (!isDuplicate) {
	                System.out.print(numbers[i] + " ");
	            }
	        }
		
		
		//Write a Java program to find the second largest element in an array.
		int[] numbers = {45, 12, 78, 90, 34, 67};

        int largest = numbers[0];
        int secondLargest = numbers[0];

        // Find largest and second largest
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > largest) {

                secondLargest = largest;
                largest = numbers[i];

            } else if (numbers[i] > secondLargest && numbers[i] != largest) {

                secondLargest = numbers[i];
            }
        }

        System.out.println("Array Elements:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\n");

        System.out.println("Largest element = " + largest);
        System.out.println("Second largest element = " + secondLargest);
    }
    
    
		
		//Write a Java program to find the second smallest element in an array.
		int[] numbers = {45, 12, 78, 3, 90, 27, 65};

        int smallest = numbers[0];
        int secondSmallest = numbers[0];

        // Find smallest and second smallest
        for (int i = 0; i < numbers.length; i++) {

	            if (numbers[i] < smallest) {
	
	                secondSmallest = smallest;
	                smallest = numbers[i];
	
	            } else if (numbers[i] < secondSmallest && numbers[i] != smallest) {
	
	                secondSmallest = numbers[i];
	            }
	        }
	
	        System.out.println("Array Elements:");
	
	        for (int i = 0; i < numbers.length; i++) {
	            System.out.print(numbers[i] + " ");
	        }
	
	        System.out.println("\n");
	
	        System.out.println("Smallest element = " + smallest);
	        System.out.println("Second smallest element = " + secondSmallest);
    	}
	
		 
		
		//Write a Java program to separate even and odd numbers of a
		//given array of integers. Put all even numbers first, and then odd
		//numbers.
		
		int[] numbers = {12, 7, 9, 20, 33, 14, 5, 18};

        System.out.println("Original Array:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\n");

        System.out.println("Array after separating even and odd numbers:");

        // Print even numbers first
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }

        // Print odd numbers next
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 != 0) {
                System.out.print(numbers[i] + " ");
            }
        }
        
        
		
		//Write a Java program to find the k largest elements in a given
		//array. Elements in the array can be in any order
		int[] numbers = {45, 12, 78, 3, 90, 27, 65};

        int k = 3;

        System.out.println("Original Array:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\n");

        // Sort array in descending order
        for (int i = 0; i < numbers.length; i++) {

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] < numbers[j]) {

                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        // Print k largest elements
        System.out.println(k + " Largest Elements are:");

        for (int i = 0; i < k; i++) {
            System.out.print(numbers[i] + " ");
        }
        
      
		
		// Write a Java program to find the k smallest elements in a given
		//array. Elements in the array can be in any order
		
		 int[] numbers = {45, 12, 78, 3, 90, 27, 65};

	        int k = 3;

	        System.out.println("Original Array:");

	        for (int i = 0; i < numbers.length; i++) {
	            System.out.print(numbers[i] + " ");
	        }

	        System.out.println("\n");

	        // Sort array in ascending order
	        for (int i = 0; i < numbers.length; i++) {

	            for (int j = i + 1; j < numbers.length; j++) {

	                if (numbers[i] > numbers[j]) {

	                    int temp = numbers[i];
	                    numbers[i] = numbers[j];
	                    numbers[j] = temp;
	                }
	            }
	        }

	        // Print k smallest elements
	        System.out.println(k + " Smallest Elements are:");

	        for (int i = 0; i < k; i++) {
	            System.out.print(numbers[i] + " ");
	        }
	        
	         
		
		//Program to copy all the elements of one array into another array
		int[] originalArray = {10, 20, 30, 40, 50};

        // Create another array with same size
        int[] copiedArray = new int[originalArray.length];

        // Copy elements from original array to copied array
        for (int i = 0; i < originalArray.length; i++) {

            copiedArray[i] = originalArray[i];
        }

        // Print original array
        System.out.println("Original Array:");

        for (int i = 0; i < originalArray.length; i++) {
            System.out.print(originalArray[i] + " ");
        }

        System.out.println("\n");

        // Print copied array
        System.out.println("Copied Array:");

        for (int i = 0; i < copiedArray.length; i++) {
            System.out.print(copiedArray[i] + " ");
        }
        
        */




		
		

		
		
		

	}

}

package com.sn;

import java.util.Scanner;

public class innerClassEx {
	
	 // create an array
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];

    public innerClassEx() {
        //fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++) {
        	System.out.println("enter the number");
            arrayOfInts[i] =  new Scanner(System.in).nextInt() ;
        }
    }

    public void printEven() {
        //print out values of even indices of the array
        InnerIterator iterator = new InnerIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.getNext() + " ");
        }
    }
    
    public void printAverage() {
    	double sum=0;
    	InnerIterator iterator = new InnerIterator();
    	 while (iterator.hasNext()) {
    		 sum=sum+iterator.getNext();
    	 }
    	 System.out.println(sum/SIZE);
    }

    // inner class implements the Iterator pattern
    private class InnerIterator{

        //start stepping through the array from the beginning
        private int next = 0;

        public boolean hasNext() {
            //check if a current element is the last in the array
            return (next <= SIZE - 1);
        }

        public int getNext() {
            /// Note that the InnerEvenIterator class refers directly
            /// to the arrayOfInts instance variable of the DataStructure
            /// object.
            int retValue = arrayOfInts[next];
            //get the next element
            next += 1;
            return retValue;
        } 
    }

    // main method
    public static void main(String s[]) {
        //fill the array with integer values and print out only values of even indices
        innerClassEx obj = new innerClassEx ();
//        obj.printEven();
        obj.printAverage();
    }

}

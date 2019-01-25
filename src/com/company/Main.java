package com.company;

public class Main {

    public static void main(String[] args) {
// this loop runs 9 times. each time it runs the inner loop (which runs 9 times and produces 9 numbers) then new line
	for(int i = 1; i <= 9; i++){
	    //each pass through the loop produces the number it runs 9 times and produces a number
	    for (int j = 1; j <= i; j++){
	        System.out.print(i);
        }
	    //make a separate line for each number sequence
	    System.out.println();
    }
    }
}

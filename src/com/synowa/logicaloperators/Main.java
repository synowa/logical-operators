package com.synowa.logicaloperators;

public class Main {

    public static void main(String[] args) {
    //first program
	int a = 20, b = 14, c = 5;
//I know that a is always grater than b here, but it's not the case, so let it be
	if (a > b & b > c)
	    System.out.println("a is grater than c");
	//second program
	boolean done = false;

	if (!done) //!done means not done, so if done is false than not done is true
		System.out.println("Keep going");
    }
}

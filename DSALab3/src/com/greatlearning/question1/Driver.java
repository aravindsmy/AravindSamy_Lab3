/**
 * 
 */
package com.greatlearning.question1;

/**
 * @author Aravindsamy
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BalancingBrackets balBrackets = new BalancingBrackets();

		String inpOne = "([[{}]])";
		String inpTwo = "([[{}]]))";

		// First input check

		System.out.println("Check Balancing for : " + inpOne);

		if (balBrackets.checkBalanced(inpOne))
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("Not Balanced ");

		// Second input check
		System.out.println("Check Balancing for : " + inpTwo);

		if (balBrackets.checkBalanced(inpTwo))
			System.out.println("Balanced ");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets");
	}

}

package assignment;

public class RecursionAssignment {

	public static void main(String[] args) {
		RecursionAssignment ra = new RecursionAssignment();
		System.out.println("The reverse of plane is "+ra.reverser("plane")); //"enalp"
		System.out.println("Is 12321 a palindrome? "+ra.isPalindrome(12321)); //true
		System.out.println("The GCD of 24 and 54 is "+ra.findGCD(24, 54)); //6

	}
	
	/**
	 * Write a recursive method that accepts a string as its argument and returns the string in reverse order.
	 * @param word - String to be reversed
	 * @return reversed of the input 
	 */
	public String reverser(String word){
		return null;
	}

	/**
	 * A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward as forward, such as madam or racecar.
	 * Write a recursive method that accepts a integer as its argument and returns true if it is palindrome, false otherwise.
	 * @param num - integer to check if it is a palindrome
	 * @return true if it is palindrome, false otherwise
	 */
	public boolean isPalindrome(int num){
		return false;
	}
	
	/**
	 * Write a recursive method to find GCD of two integers using Euclid's method. Integers can be positive or negative. 
	 * @param num1 - integer 1
	 * @param num2 - integer 2
	 * @return GDC of two numbers
	 */
	public int findGCD(int num1, int num2){
		return -1;
	}
}

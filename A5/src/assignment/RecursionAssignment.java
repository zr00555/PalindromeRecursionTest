package assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class RecursionAssignment {
	public static ArrayList<Character> rString = new ArrayList<Character>(); //https://stackoverflow.com/questions/10483139/cannot-use-arraylist-of-type-char-as-methods-argument

	public static void main(String[] args) {
		RecursionAssignment ra = new RecursionAssignment();
		System.out.println("The reverse of plane is "+ra.reverser("plane")); //"enalp"
		System.out.println("Is 12321 a palindrome? "+ra.isPalindrome(12321)); //true
		System.out.println("The GCD of 24 and 54 is "+ra.findGCD(24, 54)); //6
		
		System.out.println(78%36);

	}
	
	/**
	 * Write a recursive method that accepts a string as its argument and returns the string in reverse order.
	 * @param word - String to be reversed
	 * @return reversed of the input 
	 */
	public String reverser(String x){
		x = x.toLowerCase();
		StringBuilder builder = new StringBuilder(rString.size());  //https://stackoverflow.com/questions/6324826/converting-arraylist-of-characters-to-a-string
	    for(Character ch: rString) {
	        builder.append(ch);
	    }
		if(x.length() == 0) {
			rString.clear();
			return builder.toString();
		} else {
			rString.add(x.charAt(x.length() - 1));
			return reverser(x.substring(0, x.length() - 1));
	    }
	}

	/**
	 * A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward as forward, such as madam or racecar.
	 * Write a recursive method that accepts a integer as its argument and returns true if it is palindrome, false otherwise.
	 * @param num - integer to check if it is a palindrome
	 * @return true if it is palindrome, false otherwise
	 */
	public boolean isPalindrome(int num){
		String x = new String(String.valueOf(num));
		if(x.length() == 1 || x.length() == 0) return true;
		else {
			if(x.charAt(0) == x.charAt(x.length() - 1)) return isPalindrome(Integer.parseInt(x.substring(1, x.length() - 1)));
			else {
				return false;
			}
		}
	}
	
	/**
	 * Write a recursive method to find GCD of two integers using Euclid's method. Integers can be positive or negative. 
	 * @param num1 - integer 1
	 * @param num2 - integer 2
	 * @return GDC of two numbers
	 */
	public int findGCD(int num1, int num2){
		if(num2 == 0) {
			 return num1;
		} else {
			int remainder = (num1%num2);
			return findGCD(num2, remainder);
		}
	}
}

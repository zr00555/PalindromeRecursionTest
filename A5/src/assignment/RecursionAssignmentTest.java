package assignment;

import static org.junit.Assert.*;

import org.junit.Test;

public class RecursionAssignmentTest {
	RecursionAssignment ra = new RecursionAssignment();

	@Test
	public void TestReverserTC1() {
		String expected = "enalp";
		String actual = ra.reverser("plane");
		assertEquals(expected, actual);
	}

	@Test
	public void TestReverserTC2() {
		String expected = "enalp";
		String actual = ra.reverser("plAnE");
		assertEquals(expected, actual);
	}
	
	@Test
	public void TestReverserTC3() {
		String expected = "olleh";
		String actual = ra.reverser("HeLlO");
		assertEquals(expected, actual);
	}
	
	@Test
	public void TestisPalindromeTC1() {
		Boolean expected = true;
		Boolean actual = ra.isPalindrome(12321);
		assertEquals(expected, actual);
	}
	
	@Test
	public void TestisPalindromeTC2() {
		Boolean expected = false;
		Boolean actual = ra.isPalindrome(1232);
		assertEquals(expected, actual);
	}
	
	@Test
	public void TestisPalindromeTC3() {
		Boolean expected = true;
		Boolean actual = ra.isPalindrome(900009);
		assertEquals(expected, actual);
	}
	
	@Test
	public void TestFindGCDTC1() {
		int expected = 2;
		int actual = ra.findGCD(78, 98);
		assertEquals(expected, actual);
	}
	
	@Test
	public void TestFindGCDTC2() {
		int expected = 6;
		int actual = ra.findGCD(24, 54);
		assertEquals(expected, actual);
	}
	
	@Test
	public void TestFindGCDTC3() {
		int expected = 4;
		int actual = ra.findGCD(2088, 4652);
		assertEquals(expected, actual);
	}
}

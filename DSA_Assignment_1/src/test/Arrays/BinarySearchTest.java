package test.Arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import main.java.Arrays.BinarySearch;

class BinarySearchTest {
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("Before running test cases for Binary Search Algorithm.");
	}
	
	@AfterAll 
	static void afterAll() {
		System.out.println("After running test cases for Binary Search Algorithm.");
	}

	@Test
	void should_ReturnIndex_When_ElementFound() {
		
//		given
		int[] arr = {1, 2, 4, 6, 8, 28, 44, 51, 59, 66, 69, 71};
		int target = 28;
		int expectedResult = 5;
		
//		when
		int observedResult = BinarySearch.binarySearch(arr, target);
		
//		then
		assertEquals(expectedResult, observedResult);
	}

	@Test
	void should_ReturnNegative_When_ElementNotFound() {
		
//		given
		int[] arr = {1, 2, 4, 6, 8, 28, 44, 51, 59, 66, 69, 71};
		int target = 9;
		int expectedResult = -1;
		
//		when
		int observedResult = BinarySearch.binarySearch(arr, target);
		
//		then
		assertEquals(expectedResult, observedResult);
	}

}

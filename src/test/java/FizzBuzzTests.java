import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FizzBuzzTests {

	@Test
	void returnGivenNumberForOne() {
		assertEquals("1", FizzBuzz.fizzBuzz(1));
	}
	
	@Test
	void returnGivenNumberForTwo() {
		assertEquals("2", FizzBuzz.fizzBuzz(2));
	}
	
	@Test
	void returnFizzForThree() {
		assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
	}
	
	@Test
	void returnFizzForMultipleOfThree() {
		assertEquals("Fizz", FizzBuzz.fizzBuzz(6));
	}

	@Test
	void returnBuzzForFive() {
		assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
	}
	
	@Test
	void returnBuzzForMultipleOfFive() {
		assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
	}

	@Test
	void returnFizzBuzzForMultipleOfThreeAndFive() {
		assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
	}
}

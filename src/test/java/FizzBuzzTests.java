import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FizzBuzzTests {

	@Test
	void returnGivenNumberForOne() {
		assertEquals("1", FizzBuzz.fizzBuzzString(1));
	}
	
	@Test
	void returnGivenNumberForTwo() {
		assertEquals("2", FizzBuzz.fizzBuzzString(2));
	}
	
	@Test
	void returnFizzForThree() {
		assertEquals("Fizz", FizzBuzz.fizzBuzzString(3));
	}
	
}

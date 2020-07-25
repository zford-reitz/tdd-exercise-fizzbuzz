
public class FizzBuzz {

	public static String fizzBuzz(int naturalNumberGreaterThanZero) {
		if (naturalNumberGreaterThanZero % 3 == 0) {
			return "Fizz";
		}
		
		return String.valueOf(naturalNumberGreaterThanZero);
	}
}

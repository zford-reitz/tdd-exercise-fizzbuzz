
public class FizzBuzz {

	public static String fizzBuzz(int naturalNumberGreaterThanZero) {
		if (isMultipleOfThree(naturalNumberGreaterThanZero)) {
			return "Fizz";
		}
		
		return String.valueOf(naturalNumberGreaterThanZero);
	}

	private static boolean isMultipleOfThree(int naturalNumberGreaterThanZero) {
		return naturalNumberGreaterThanZero % 3 == 0;
	}
}

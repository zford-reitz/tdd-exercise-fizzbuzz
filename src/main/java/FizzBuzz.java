
public class FizzBuzz {

	public static String fizzBuzz(int naturalNumberGreaterThanZero) {
		if (isFizz(naturalNumberGreaterThanZero)) {
			return "Fizz";
		} else if (naturalNumberGreaterThanZero % 5 == 0) {
			return "Buzz";
		}
		
		return String.valueOf(naturalNumberGreaterThanZero);
	}

	private static boolean isFizz(int naturalNumberGreaterThanZero) {
		return naturalNumberGreaterThanZero % 3 == 0;
	}
}

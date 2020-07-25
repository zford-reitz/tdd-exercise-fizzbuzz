
public class FizzBuzz {

	private static final int FIZZ_DIVISOR = 3;
	private static final int BUZZ_DIVISOR = 5;

	public static String fizzBuzz(int naturalNumberGreaterThanZero) {
		if (isFizzBuzz(naturalNumberGreaterThanZero)) {
			return "FizzBuzz";
		} else if (isFizz(naturalNumberGreaterThanZero)) {
			return "Fizz";
		} else if (isBuzz(naturalNumberGreaterThanZero)) {
			return "Buzz";
		}
		
		return String.valueOf(naturalNumberGreaterThanZero);
	}

	private static boolean isFizzBuzz(int naturalNumberGreaterThanZero) {
		return isFizz(naturalNumberGreaterThanZero) && isBuzz(naturalNumberGreaterThanZero);
	}

	private static boolean isFizz(int naturalNumberGreaterThanZero) {
		return naturalNumberGreaterThanZero % FIZZ_DIVISOR == 0;
	}

	private static boolean isBuzz(int naturalNumberGreaterThanZero) {
		return naturalNumberGreaterThanZero % BUZZ_DIVISOR == 0;
	}
	
}

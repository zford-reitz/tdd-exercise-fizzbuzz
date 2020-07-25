
public class FizzBuzz {

	private static final int FIZZ_DIVISOR = 3;
	private static final int BUZZ_DIVISOR = 5;

	public static String fizzBuzz(int naturalNumberGreaterThanZero) {
		String s = fizz(naturalNumberGreaterThanZero) + buzz(naturalNumberGreaterThanZero);
		if (!s.isEmpty()) {
			return s; 
		}
		
		return String.valueOf(naturalNumberGreaterThanZero);
	}

	private static String fizz(int naturalNumberGreaterThanZero) {
		if (isFizz(naturalNumberGreaterThanZero)) {
			return "Fizz";
		}
		
		return "";
	}
	

	private static String buzz(int naturalNumberGreaterThanZero) {
		if (isBuzz(naturalNumberGreaterThanZero)) {
			return "Buzz";
		}
		
		return "";
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


public class FizzBuzz {

	public static String fizzBuzz(int naturalNumberGreaterThanZero) {
		if (isFizz(naturalNumberGreaterThanZero)) {
			return "Fizz";
		} else if (isBuzz(naturalNumberGreaterThanZero)) {
			return "Buzz";
		}
		
		return String.valueOf(naturalNumberGreaterThanZero);
	}

	private static boolean isFizz(int naturalNumberGreaterThanZero) {
		return naturalNumberGreaterThanZero % 3 == 0;
	}

	private static boolean isBuzz(int naturalNumberGreaterThanZero) {
		return naturalNumberGreaterThanZero % 5 == 0;
	}
	
}

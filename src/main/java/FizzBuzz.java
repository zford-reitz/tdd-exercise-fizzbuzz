
public class FizzBuzz {

	public static String fizzBuzz(int naturalNumberGreaterThanZero) {
		if (isFizz(naturalNumberGreaterThanZero)) {
			return "Fizz";
		}
		
		return String.valueOf(naturalNumberGreaterThanZero);
	}

	private static boolean isFizz(int naturalNumberGreaterThanZero) {
		return naturalNumberGreaterThanZero % 3 == 0;
	}
}

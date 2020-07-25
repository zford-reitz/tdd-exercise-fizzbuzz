import java.util.Optional;

public class FizzBuzz {

	private static final int FIZZ_DIVISOR = 3;
	private static final int BUZZ_DIVISOR = 5;

	public static String fizzBuzz(int number) {
		return generateWackyText(number).orElse(String.valueOf(number));
	}

	private static Optional<String> generateWackyText(int number) {
		String maybeWackyText = fizz(number) + buzz(number);
		if (maybeWackyText.isEmpty()) {
			return Optional.empty();
		}
		
		return Optional.of(maybeWackyText);
	}

	private static String fizz(int number) {
		if (isFizz(number)) {
			return "Fizz";
		}
		
		return "";
	}
	

	private static String buzz(int number) {
		if (isBuzz(number)) {
			return "Buzz";
		}
		
		return "";
	}
	
	private static boolean isFizz(int number) {
		return number % FIZZ_DIVISOR == 0;
	}

	private static boolean isBuzz(int number) {
		return number % BUZZ_DIVISOR == 0;
	}
	
}

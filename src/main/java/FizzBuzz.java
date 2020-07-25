import java.util.Optional;

public class FizzBuzz {

	private static final int FIZZ_DIVISOR = 3;
	private static final int BUZZ_DIVISOR = 5;

	public static String fizzBuzz(int number) {
		return generateWackyText(number).orElse(String.valueOf(number));
	}

	private static Optional<String> generateWackyText(int number) {
		StringBuilder wackyTextBuilder = new StringBuilder();
		fizz(number, wackyTextBuilder);
		buzz(number, wackyTextBuilder);
		
		String wackyText = wackyTextBuilder.toString();
		if (wackyText.isEmpty()) {
			return Optional.empty();
		}
		
		return Optional.of(wackyText);
	}

	private static void fizz(int number, StringBuilder textOutput) {
		if (isFizz(number)) {
			textOutput.append("Fizz");
		}
	}
	

	private static void buzz(int number, StringBuilder textOutput) {
		if (isBuzz(number)) {
			textOutput.append("Buzz");
		}
	}
	
	private static boolean isFizz(int number) {
		return number % FIZZ_DIVISOR == 0;
	}

	private static boolean isBuzz(int number) {
		return number % BUZZ_DIVISOR == 0;
	}
	
}

import java.util.Optional;
import java.util.function.IntPredicate;

public class FizzBuzz {

	private static class WackyTextGenerator {
		private final String wackyText;
		private final IntPredicate predicate;
		
		private WackyTextGenerator(String wackyText, IntPredicate predicate) {
			this.wackyText = wackyText;
			this.predicate = predicate;
		}

		public void addWackyText(int number, StringBuilder textOutput) {
			if (this.predicate.test(number)) {
				textOutput.append(this.wackyText);
			}
		}

	}
	
	private static final int FIZZ_DIVISOR = 3;
	private static final int BUZZ_DIVISOR = 5;

	private static WackyTextGenerator[] WACKY_TEXT_GENERATORS = {
			new WackyTextGenerator("Fizz", FizzBuzz::isFizz),
			new WackyTextGenerator("Buzz", FizzBuzz::isBuzz)
	};
	
	public static String fizzBuzz(int number) {
		return generateWackyText(number).orElse(String.valueOf(number));
	}

	private static Optional<String> generateWackyText(int number) {
		StringBuilder wackyTextBuilder = new StringBuilder();
		for (WackyTextGenerator wackyTextGenerator : WACKY_TEXT_GENERATORS) {
			wackyTextGenerator.addWackyText(number, wackyTextBuilder);
		}
		
		String wackyText = wackyTextBuilder.toString();
		if (wackyText.isEmpty()) {
			return Optional.empty();
		}
		
		return Optional.of(wackyText);
	}

	private static boolean isFizz(int number) {
		return number % FIZZ_DIVISOR == 0;
	}

	private static boolean isBuzz(int number) {
		return number % BUZZ_DIVISOR == 0;
	}
	
}

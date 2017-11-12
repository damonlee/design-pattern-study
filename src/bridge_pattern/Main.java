package bridge_pattern;

public class Main {

	public static void main(String[] args) {
		//PrintMorseCode code = new PrintMorseCode(new DefaultMorseCodeFunction());
		//PrintMorseCode code = new PrintMorseCode(new SoundMorseCodeFunction());
		PrintMorseCode code = new PrintMorseCode(new FlashMorseCodeFunction());
		
		
		// 이렇게 해도 되긴 하는데 chaining을 이용해보자
		// code.y(); code.j(); code.h();		
		code.y().j().h();
		
	}
}

package bridge_pattern;

public class SoundMorseCodeFunction implements MorseCodeFunction{

	@Override
	public void dot() {
		System.out.print("삑");
	}

	@Override
	public void dash() {
		System.out.print("삐이");
	}

	@Override
	public void space() {
		System.out.print("음");
	}

}

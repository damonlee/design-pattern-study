package bridge_pattern;

public class PrintMorseCode extends MorseCode {
	 
	public PrintMorseCode(MorseCodeFunction function) {
		super(function);
	}
	
	// chaining을 쓰기 위해 return 자료형 PrintMorseCode로 변경
	public PrintMorseCode y() {
		dash(); dot(); dash(); dash(); space();
		return this;
		
	}
	public PrintMorseCode j() {
		dot(); dash(); dash(); dash(); space();
		return this;
	}
	public PrintMorseCode h() {
		dot(); dot(); dot(); space();
		return this;
	}
	
}

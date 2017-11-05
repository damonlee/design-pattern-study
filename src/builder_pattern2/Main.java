package builder_pattern2;

public class Main {

	public static void main(String[] args) {

		// 이렇게 실수를 하거나 인자 값이 많을 경우
		// Computer computer = new Computer("256g ssd", "i7", "8g");
		
		// chaining.
		// 조금 더 가독성 있게 해줌
		Computer computer = ComputerBuilder
				.start()
				.setCpu("i7")
				.setRam("8g")
				.setStroage("128g ssd")
				.build();
		
		System.out.println(computer);
	}

}

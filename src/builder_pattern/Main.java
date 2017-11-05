package builder_pattern;

public class Main {

	public static void main(String[] args) {
		
		ComputerFactory factory = new ComputerFactory();
		
		factory.setBlueprint(new LgGramBluePrint());
		factory.make();
		
		Computer computer =  factory.getComputer();
		
		System.out.println(computer.toString());
	}

}

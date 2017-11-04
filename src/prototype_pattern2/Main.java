package prototype_pattern2;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		/**
		 * 1) 얕은 복사
		 */
		Cat cat1 = new Cat();
		cat1.setName("야옹");
		
		Cat cat2 = cat1;		
		cat2.setName("고양이");
		
		System.out.println(cat1.getName());
		System.out.println(cat2.getName());
		
		/**
		 * 2) 깊은 복사 (String인 이름은 깊은 복사가 이루어짐)
		 * Integer나 String은 자바에서 주소값을 변경해서 깊은 복사가 자동으로 이루어지도록 하는 기능이 있는 것으로 추측됨
		 * 
		 */
		Cat cat3 = new Cat();
		cat3.setName("어흥");
		cat3.setAge(new Age(2014,12,20));
		
		Cat cat4 = cat3.copy();	
		cat4.setName("호랑이");
		
		// cat3.setAge(new Age(2017,10,12));
		cat4.getAge().setYear(2017);
		cat4.getAge().setMonth(10);
		cat4.getAge().setDate(12);
		
		System.out.println(cat3.getName());
		System.out.println(cat3.getAge().getYear());
		System.out.println(cat4.getName());
		System.out.println(cat4.getAge().getYear());
		
	}
}

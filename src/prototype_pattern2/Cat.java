package prototype_pattern2;

public class Cat implements Cloneable{

	private String name;
	private Age age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Age getAge() {
		return age;
	}
	
	public void setAge(Age age) {
		this.age = age;
	}
	
	public Cat copy() throws CloneNotSupportedException {
		Cat cat = (Cat)this.clone();
		
		// 객체값은 깊은 복사가 이루어지지 않으므로. 명시적으로 깊은 복사를 해주는 코드를 추가
		cat.setAge(new Age(this.age.getYear(), this.age.getMonth(), this.age.getDate()));
		return cat;
		
	}
}

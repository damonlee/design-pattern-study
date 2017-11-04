package prototype_pattern;

public class Circle implements Cloneable {

	private int x,y,r;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	public Circle(int x, int y, int r) {
		super();
		this.x = x;
		this.y = y;
		this.r = r;
	}

	public Circle copy() throws CloneNotSupportedException {
		Circle circle = (Circle) clone();	// 인스턴스  복사 (주소값이 복사가 아님)
		circle.x+=1;
		circle.y+=1;
		return circle;
	}
	
}

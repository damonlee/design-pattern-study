package composite_pattern;

// Leaf 요소로  File 클래스가 이 역할을 담당하고 있음.
public class File extends Component {

	public File(String name) {
		super(name);
	}

	private Object data;
	
	public void setData(Object data) {
		this.data = data;
	}
	
	public Object getData() {
		return data;
	}
}

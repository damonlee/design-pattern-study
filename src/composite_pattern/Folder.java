package composite_pattern;

import java.util.ArrayList;
import java.util.List;

// Composite 요소로  Component 요소를 자식으로 가진다. 
// 따라서  Component 요소를 관리하기 위한 메소드들을 추가적으로 구현해주어야 함.
public class Folder extends Component {

	private List<Component> children = new ArrayList<>();

	public Folder(String name) {
		super(name);
	}
	
	public boolean addComponent(Component component) {
		return children.add(component);
	}
	
	public boolean removeComponent(Component component) {
		return children.remove(component);
	}
	
	public List<Component> getChildren() {
		return children;
	}
}

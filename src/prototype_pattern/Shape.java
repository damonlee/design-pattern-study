package prototype_pattern;

/**
 * 
 * @author 유정현
 *
 */
public class Shape implements Cloneable {

	private String id;
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
}

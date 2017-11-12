package composite_pattern;

public class Main {

	public static void main(String[] args) {
		Folder	
		root = new Folder("root"),
		home = new Folder("home"),
		yjh = new Folder("yjh"),
		music = new Folder("music"),
		picture = new Folder("picture"),
		doc = new Folder("doc"),
		usr = new Folder("usr");
		
		File
		track1 = new File("track1"),
		track2 = new File("track2"),
		pic1 = new File("pic1"),
		doc1 = new File("doc1"),
		java = new File("java");
		
		
		root.addComponent(home);
			home.addComponent(yjh);
			yjh.addComponent(music);
				music.addComponent(track1);
				music.addComponent(track2);
			yjh.addComponent(picture);
				picture.addComponent(pic1);
			yjh.addComponent(doc);
				doc.addComponent(doc1);
		
		root.addComponent(usr);
			usr.addComponent(java);
			
		show(root, "");
	}
	
	private static void show(Component component, String blank) {
		System.out.println(blank + component.getName());
		
		if(component instanceof Folder) {
			for(Component c : ((Folder)component).getChildren()) {
				show(c , blank+" ");
			}
		}
	}
}

package abstract_factory_pattern2;

import abstract_factory_pattern2.abst.Button;
import abstract_factory_pattern2.abst.GUIFactory;
import abstract_factory_pattern2.abst.TextArea;
import abstract_factory_pattern2.concrete.FactoryInstance;

public class Main {

	public static void main(String[] args) {
		//GUIFactory factory = new LinuxGUIFactory();
		//GUIFactory factory = new MacGUIFactory();
		//GUIFactory factory = new WinGUIFactory();
		GUIFactory factory = FactoryInstance.getGUIFactory();

		Button button = factory.createButton();
		TextArea textArea = factory.createTextArea();
		
		button.click();
		System.out.println(textArea.getText());
	}

}

package abstract_factory_pattern2.concrete;

import abstract_factory_pattern2.abst.Button;
import abstract_factory_pattern2.abst.GUIFactory;
import abstract_factory_pattern2.abst.TextArea;

public class FactoryInstance {

	public static GUIFactory getGUIFactory() {
		switch (getOsCode()) {
		case 0:	return new MacGUIFactory();
		case 1:	return new LinuxGUIFactory();
		case 2:	return new WinGUIFactory();
		}
		return null;
	}

	private static int getOsCode() {
		if(System.getProperty("os.name").contains("Mac")) {
			return 0;
		} else if(System.getProperty("os.name").contains("Linux")) {
			return 1;
		} else if(System.getProperty("os.name").contains("Windows")) {
			return 2;
		}
		return 0;
	}
}


class LinuxGUIFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new LinuxButton();
	}

	@Override
	public TextArea createTextArea() {
		return new LinuxTextArea();
	}
}

class LinuxButton implements Button {

	@Override
	public void click() {
		System.out.println("리눅스 버튼");
	}

}

class LinuxTextArea implements TextArea {

	@Override
	public String getText() {
		return "리눅스 textArea";
	}

}

class MacGUIFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new MacButton();
	}

	@Override
	public TextArea createTextArea() {
		return new MacTextArea();
	}

}

class MacButton implements Button {

	@Override
	public void click() {
		System.out.println("맥 버튼");
	}

}

class MacTextArea implements TextArea {

	@Override
	public String getText() {
		return "맥 textArea";
	}

}

class WinGUIFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new WinButton();
	}

	@Override
	public TextArea createTextArea() {
		return new WinTextArea();
	}

}

class WinButton implements Button {

	@Override
	public void click() {
		System.out.println("윈도우 버튼");
	}

}

class WinTextArea implements TextArea {

	@Override
	public String getText() {
		return "윈도우 textArea";
	}

}



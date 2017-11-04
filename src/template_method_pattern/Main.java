package template_method_pattern;

import template_method_pattern.helper.AbstGameConnectHelper;
import template_method_pattern.helper.DefaultGameConnectionHelper;
import template_method_pattern.helper.upgradedGameConnectionHelper;

public class Main {

	public static void main(String[] args) {

		AbstGameConnectHelper helper = new DefaultGameConnectionHelper();
		// AbstGameConnectHelper helper = new upgradedGameConnectionHelper();
		helper.requestConnection("아이디 암호 등 접속 정보");
	}

}

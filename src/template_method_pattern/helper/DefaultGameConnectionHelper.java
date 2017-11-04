package template_method_pattern.helper;

/**
 * 하위 클래스에서 구체적인 정보 확인
 * @author 유정현
 *
 */
public class DefaultGameConnectionHelper extends AbstGameConnectHelper {

	@Override
	protected String doSecurity(String string) {
		System.out.println("디코드");
		return null;
	}

	@Override
	protected boolean authentication(String id, String password) {
		System.out.println("아이디 / 암호 확인 과정");
		return true;
	}

	@Override
	protected int authorizaion(String userName) {
		System.out.println("권한 확인");
		return 0;
	}

	@Override
	protected String connection(String info) {
		System.out.println("마지막 접속 단계!");
		return info;
	}

}

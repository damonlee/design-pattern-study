package template_method_pattern.helper;

/**
 * 하위 클래스에서 구체적인 정보 확인
 * @author 유정현
 *
 */
public class upgradedGameConnectionHelper extends AbstGameConnectHelper {

	@Override
	protected String doSecurity(String string) {
		System.out.println("강화된 알고리즘을 이용한 디코드");
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
	
		// 서버에서 유저의 나이를 확인하고 지금 시간을 체크 후
		// 유저가 성인이 아니고 10시가 지났다면, 권한이 없는 것으로 한다
		return -1;
	}

	@Override
	protected String connection(String info) {
		System.out.println("마지막 접속 단계!");
		return info;
	}

}

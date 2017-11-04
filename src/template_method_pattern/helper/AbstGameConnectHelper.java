package template_method_pattern.helper;

public abstract class AbstGameConnectHelper {
	// 외부에서 호출은 하면 안되지만, 하위 클래스에서 구현 가능하도록 해야함
	protected abstract String doSecurity(String string);
	protected abstract boolean authentication(String id, String password);
	protected abstract int authorizaion(String userName);
	protected abstract String connection(String info);
	
	/**
	 * 템플릿 메소드
	 * @param encodedInfo
	 * @return
	 */
	public String requestConnection(String encodedInfo) {
		// 1. 보안 작업 -> 암호화 된 문자열을 디코드(복호화)
		String decodedInfo =  doSecurity(encodedInfo);
		
		// 반환된 것을 가지고 아이디, 암호를 할당한다.
		String id = "yoojh9";
		String password= "1234";
		
		// 2. 인증과정
		if(!authentication(id, password)) {
			throw new Error("아이디, 암호 불일치");
		}
		
		// 3. 권한 과정
		String userName = "userName";
		int level = authorizaion(userName);
		
		switch (level) {
		case -1: // 셧다운
			throw new Error("shutdown");
		case 0:  // 게임매니저
			break;
		case 1:  // 유료 회원
			break;
		case 2:  // 무료 회원
			break;
		case 3:  // 권한 없음
			break;
		default: // 기타 상황
			break;
		}
		
		return connection(decodedInfo);
	}
}

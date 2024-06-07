package kosa.shopping;

public class UserException {

	public static boolean nameException(String name) throws Exception {

		if (name.trim().isEmpty()) {
			throw new Exception("빈 문자열입니다.");
		}
		return true;
	}

	public static boolean ageException(String age) throws Exception {

		if (age.trim().isEmpty()) {
			throw new Exception("나이를 다시 입력하시오.");
		}
		return true;
	}
}

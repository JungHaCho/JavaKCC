package kosa.shopping;

public class UserException {

	public static boolean nameException(String name) throws Exception {

		if (name.trim().isEmpty()) {
			throw new Exception("�� ���ڿ��Դϴ�.");
		}
		return true;
	}

	public static boolean ageException(String age) throws Exception {

		if (age.trim().isEmpty()) {
			throw new Exception("���̸� �ٽ� �Է��Ͻÿ�.");
		}
		return true;
	}
}

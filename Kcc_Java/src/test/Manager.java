package test;

public class Manager {

	PhoneInfo[] phoneInfos; // [null, null 10]
	int cnt = 0;

	public Manager() {
		phoneInfos = new PhoneInfo[10];
	}

	public void add(PhoneInfo phoneInfo) {
		phoneInfos[cnt++] = phoneInfo;
		System.out.println(">전화번호가 등록 되었습니다. ");
	}

	public void printList() {
		for (int i = 0; phoneInfos[i] != null; i++) {
			phoneInfos[i].print();
		}
	}

	public void search(String name) {
		for (int i = 0; phoneInfos[i] != null; i++) {
			if (phoneInfos[i].name.equals(name)) {
				phoneInfos[i].print();
			}
		}
	}
}

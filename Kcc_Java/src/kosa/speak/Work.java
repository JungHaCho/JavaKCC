package kosa.speak;

import kosa.implement.Role;

public class Work extends Man implements Speakable {

	public Work(String name) {
		super(name);
	}

	@Override
	public String speak() {
		return getName() + " ������ ���ؾ� �Ѵ�.";
	}

}

package kosa.oop.book;

public class Book {
	// ����: å�̸�, ����, ���ε� ����
	// ���: ���ε� ���� ����, å ������ ���
	String bookName;
	int price;
	int dc_price;

	public Book() {
	}

	public Book(String bookName, int price) {
		this.bookName = bookName;
		this.price = price;
	}

	public void discount() {
		if (price >= 30000) {
			dc_price = (int) (price * 0.75);
		} else if (price >= 20000) {
			dc_price = (int) (price * 0.80);
		} else if (price >= 15000) {
			dc_price = (int) (price * 0.85);
		}
	}

	public void printBook() {
		System.out.println(bookName + "������ ������ " + price + "�� ���ε� ������ " + dc_price + "�� �Դϴ�.");
	}
}

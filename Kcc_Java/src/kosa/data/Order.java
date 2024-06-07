package kosa.data;

import java.util.LinkedList;

public class Order {

	private LinkedList<Food> queue; // �ֹ���� ����Ʈ
	private int amount; // �Ѹ���

	public Order() {
		queue = new LinkedList();
	}

	// �ֹ���û
	public void foodOrder(String menuName, int price) {
		queue.offer(new Food(menuName, price)); // [�̸�: ���, ����: 5000].
	}

	// �ֹ�ó��
	public void foodPulse() {
		Food food = queue.poll();
		amount += food.getPrice();
		System.out.println("�ֹ�ó����");
	}

	// ����� �Ѿ�
	public void printTotalPrice() {
		System.out.println(amount + "��");
	}
}

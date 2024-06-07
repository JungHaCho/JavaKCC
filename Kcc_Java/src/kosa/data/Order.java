package kosa.data;

import java.util.LinkedList;

public class Order {

	private LinkedList<Food> queue; // 주문목록 리스트
	private int amount; // 총매출

	public Order() {
		queue = new LinkedList();
	}

	// 주문요청
	public void foodOrder(String menuName, int price) {
		queue.offer(new Food(menuName, price)); // [이름: 라면, 가격: 5000].
	}

	// 주문처리
	public void foodPulse() {
		Food food = queue.poll();
		amount += food.getPrice();
		System.out.println("주문처리됨");
	}

	// 매출액 총액
	public void printTotalPrice() {
		System.out.println(amount + "원");
	}
}

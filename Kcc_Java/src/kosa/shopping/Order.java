package kosa.shopping;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {

	private static int orderUID = 1;

	private int orderId;

	private DeliveryStatus deliveryStatus;
	private List<Product> productList;
	private int totalPrice;

	private User fromUser;
	private LocalDateTime createdAt;

	public Order() {

	}

	public Order(User fromUser) {
		super();
		this.orderId = orderUID++;

		this.createdAt = LocalDateTime.now();

		this.productList = productList;
		this.fromUser = fromUser;

		this.deliveryStatus = DeliveryStatus.WAITING;
	
	}

	public void printOrderInfo() {
		System.out.println("결제인"+fromUser+"결제 날짜"+createdAt+"배송안내"+deliveryStatus);
	}
	
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public DeliveryStatus getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public User getFromUser() {
		return fromUser;
	}

	public void setFromUser(User fromUser) {
		this.fromUser = fromUser;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

}

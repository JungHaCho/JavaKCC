package kosa.bank;
// 고객 등록과 함께 계좌가 생성되야한다.

public class MyBank {

	private int customersNum;
	private Customer[] customers;

	public MyBank() {
		customers = new Customer[10];
	}

	public void addCustomer(String id, String name, long balance) {
		customers[customersNum++] = new Customer(id, name, balance);
	}

	public int getCustomersNum() {
		return customersNum;
	}

	public Customer getCustomer(String id) {
		Customer cust = null ;
		for(int i =0; i<customersNum;i++) {
			
			if(customers[i].getId().equals(id)) {
				cust = customers[i];
				break;
			}
		}		
		
		return cust;
	}
	
	public Customer[] getAllCustomers() {
		
		Customer newCustomer[] = new Customer[customersNum];
		for(int i =0; i<customersNum;i++) {
			newCustomer[i] = customers[i];
		}
		return newCustomer;
	}
	
	

	
}

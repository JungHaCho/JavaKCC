package kosa_phone.k;



public class Main {
	
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
	
		Manager m = new Manager();

		while (true) {

			System.out.println("1.�߰� 2.��ü���? 3.ã�� 4. ������Ʈ 5. ���� 6.����");
			System.out.print("�޴��Է�");

			//String menu = sc.nextLine();
			DateInput.s();
			String menu = DateInput.sc.nextLine();
			
			switch (menu) {

			case "1":
				m.addPhoneInfo();
				break;

			case "2":
				m.listPhoneInfo();
				break;
				
			case "3":
				m.searchPhoneInfo();
				break;
			
			case "4":
				m.updatePhoneInfo();
				break;
			case "5":
				m.deletePhoneInfo();
				break;
			
			case "6":
				System.out.println("����");
				m.sort();
				break;
				
			case "7":
				System.out.println("������ ����");
				m.customerDataWrite();
				break;
				
			case "8":
				System.out.println("�����? ������ �б�");
				m.customerDataRead();
				break;
			
			case "9":
				System.out.println("����");
				return;
			

			}
		}

	}

}

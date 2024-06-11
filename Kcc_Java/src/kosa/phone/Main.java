package kosa.phone;



public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
	
		Manager m = new Manager();

		while (true) {

			System.out.println("1.추가 2.전체출력 3.찾기 4. 업데이트 5. 삭제 6.종료");
			System.out.print("메뉴입력");

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
				System.out.println("정렬");
				m.sort();
				break;
				
			case "7":
				System.out.println("데이터 저장");
				m.customerDataWrite();
				break;
				
			case "8":
				System.out.println("저장된 데이터 읽기");
				m.customerDataRead();
				break;
			
			case "9":
				System.out.println("종료");
				return;
			

			}
		}

	}

}

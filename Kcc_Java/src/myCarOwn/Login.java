package myCarOwn;

import java.util.ArrayList;

import java.util.List;

public class Login {

	private List<Employee> employeeList;

	public Login() {
		// 딜러 관리자 정보 미리 저장
		this.employeeList = new ArrayList<Employee>(Dummy.setLoginData());
	}

	// 회사 직원여부 함수 : 이름으로 확인
	public Employee findEmployee(String name) {
		for (Employee employee : employeeList) {
			// 사용자 정보 존재 여부
			if (name.equals(employee.getName())) {
				System.out.println(employee.getName());
				return employee;
			}
		}
		System.out.println("존재하지 않는 사용자입니다.");
		return null;
	}

//	public static void main(String[] args) {
//		Login l = new Login();
//		Admin a = (Admin) l.findEmployee("조정하");
//		System.out.println(l.findEmployee("조정하").getRoll());
//		l.findEmployee("딜러1");
//		l.findEmployee("ㄴㄴ");
//	}

}

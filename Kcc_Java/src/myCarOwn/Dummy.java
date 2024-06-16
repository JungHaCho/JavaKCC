package myCarOwn;

import java.util.Arrays;
import java.util.List;

import myCar.util.CarColor;
import myCar.util.CarType;
import myCar.util.PaymentStatus;

public class Dummy {

	public static List<Employee> setLoginData() {
		return Arrays.asList(new Admin("조정하", "010-5468-7816"), new Dealer("딜러1", "010-1234-5678"),
				new Dealer("딜러2", "010-2222-2222")

		);
	}
	
	public static List<Car> setCarData() {
		return Arrays.asList(
				new Car(CarType.CONVERTIBLE, CarColor.RED, PaymentStatus.TRANSFERRING_MONEY, "1111", 2000000, 2000,"2024")

		);
	}

}

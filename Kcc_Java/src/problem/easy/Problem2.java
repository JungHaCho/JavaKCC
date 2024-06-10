package problem.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem2 {

	/**
	 * 주어진 정수 리스트의 각 요소를 제곱하여 새로운 리스트를 반환합니다.
	 *
	 * @param numbers 원본 정수 리스트
	 * @return 각 요소를 제곱한 새 리스트
	 */

	public static List<Integer> squareNumbers(List<Integer> numbers) {
		// 여기에 코드 작성

		List<Integer> numberList = numbers.stream()
				.map(numberInteger -> numberInteger.intValue() * numberInteger.intValue()).collect(Collectors.toList());
		return numberList;
	}

	public static void main(String[] args) {

		List<Integer> input = Arrays.asList(1, 2, 3, 4);
		squareNumbers(input).forEach(num -> System.out.print(num));

//		List<Integer> expected = Arrays.asList(1, 4, 9, 16);

	}
}
package problem.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem1 {

	/**
	 * 주어진 문자열 리스트에서 길이가 5 이상인 문자열만을 포함하는 리스트를 반환합니다.
	 *
	 * @param strings 원본 문자열 리스트
	 * @return 길이가 5 이상인 문자열만 포함하는 리스트
	 */

	public static List<String> filterStrings(List<String> strings) {

		List<String> liststringsStream = strings.stream().filter(str -> (str.length() >= 5))
				.collect(Collectors.toList());

		return liststringsStream;
	}

	public static void main(String[] args) {

		List<String> list = Arrays.asList("app", "grape", "banana", "kiwi");
		List<String> resultList = filterStrings(list);

		resultList.stream().forEach(resultString -> System.out.println(resultString));
	}

}

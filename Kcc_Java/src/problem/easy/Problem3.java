package problem.easy;

import java.util.Arrays;
import java.util.List;

public class Problem3 {

    /**
     * 주어진 Double 리스트의 모든 요소의 합계를 반환합니다.
     *
     * @param numbers 원본 Double 리스트
     * @return 요소들의 합계
     */
   
	public static double sumOfList(List<Double> numbers) {
        // 여기에 코드 작성
		double d = numbers.stream().mapToDouble(num->num).sum();
		
		return d;
    }
	
	public static void main(String[] args) {
		List<Double> input = Arrays.asList(1.5, 2.5, 3.5);
//        double expected = 7.5;
		
		System.out.println(sumOfList(input));
		
	}
    
}
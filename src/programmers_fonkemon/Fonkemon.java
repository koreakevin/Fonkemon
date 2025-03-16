package programmers_fonkemon;

import java.util.HashSet;
import java.util.Set;

public class Fonkemon {
	// 실행 테스트를 위해서 필요한 부분
	/*
	 * public static void main(String[] args) 
	 * { Fonkemon sol = new Fonkemon(); //Fonkemon 객체 생성 
	 * int[] nums = {3, 1, 2, 3}; // 테스트 데이터 
	 * int result = sol.solution(nums); // solution 메서드 실행 
	 * System.out.println("결과: " + result); 
	 * }
	 */
	public int solution(int[] nums) {
		// 중복을 제거하여 폰켓몬의 종류를 구함
		Set<Integer> uniqueMons = new HashSet<>();
		for (int num : nums) {
			uniqueMons.add(num);
		}

		// 중복 제거 후 폰켓몬 종류 출력
		System.out.println("서로 다른 폰켓몬 종류: " + uniqueMons);

		// 선택할 수 있는 폰켓몬의 수 (N/2) 계산
		int maxSelect = nums.length / 2;
		System.out.println("선택할 수 있는 폰켓몬의 수: " + maxSelect);

		// 실제 선택 할수 있는 최대 종류의 계수 계산
		int result = Math.min(uniqueMons.size(), maxSelect);
		System.out.println("선택할 수 잇는 최대 종류의 폰켓몬 개수: " + result);

		return result; // 반환값 변경
	}
}
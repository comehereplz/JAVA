package exam;

import java.util.HashMap;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap();

		map.put("이유진", 96);
		map.put("홍길동", 86);
		map.put("이순신", 92);

		String name = null;
		String minName = null;
		int maxScore = 0;
		int minScore = 999;
		int totalScore = 0;

		Set<HashMap.Entry<String, Integer>> entrySet = map.entrySet();// 시험에 나올 수도 있음
		for (HashMap.Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > maxScore) {
				maxScore = entry.getValue();
				name = entry.getKey();
			}
			if (entry.getValue() < minScore) {
				minScore = entry.getValue();
				minName = entry.getKey();
			}
			totalScore += entry.getValue();
		}
		int avgScore = totalScore / map.size();

		System.out.println("평균 점수 : " + avgScore);
		System.out.println("최고 점수 : " + maxScore);
		System.out.println("최고 점수를 받은 아이디 : " + name);
		System.out.println("최저 점수 : " + minScore);
		System.out.println("최저 점수를 받은 아이디 : " + minName);
	}

}

package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import collection.Member;

public class MemberHashSet {
	private HashSet<Member> hashSet;	// HashSet 선언

	public MemberHashSet() {
		hashSet = new HashSet<Member>();	// HashSet 생성
	}

	public void addMember(Member member) {	// HashSet에 회원 추가
		hashSet.add(member);
	}

	public boolean removeMember(int memberId) {	// 매개변수로 받은 회원 아이디에 해당하는 회원 삭제
		Iterator<Member> ir = hashSet.iterator();	//	Iterator를 활용해 순회함

		while (ir.hasNext()) {
			Member member = ir.next();	// 회원을 하나씩 가져와서
			int tempId = member.getMemberId();	// 아이디 비교
			if (tempId == memberId) {	// 같은 아이디인 경우
				hashSet.remove(member);	// 회원 삭제
				return true;
			}
		}

		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}

	public void showAllMember() {	// 모든 회원 출력
		for (Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}

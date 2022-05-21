package collection.arraylist;

import java.util.ArrayList;
import collection.Member;	// Member 클래스는 collection 패키지에 있으므로 사용하려면 import해야 함.

public class MemberArrayList {
	private ArrayList<Member> arrayList;	// ArrayList 선언
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();	// Member형으로 선언한 ArrayList 생성
	}
	public void addMember(Member member) {	// ArrayList에 회원을 추가하는 메서드
		arrayList.add(member);
	}
	
	public boolean removeMember(int MemberID) {
		for(int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int tempID = member.getMemberID();	// get() 메서드로 회원을 순차적으로 가져옴
			if(tempID == MemberID) {	// 회원 아이디가 매개변수와 일치하면
				arrayList.remove(i);	// 해당 회원을 삭제
				return true;
			}
		}
		System.out.println(MemberID + "가 존재하지 않습니다."	);	// 반복문이 끝날 때까지 해당 아이디를 찾지 못한 경우
		return false;
	}
	
	public void showAllMember() {	// 해당 아이디를 가진 회원을 ArrayList에서 찾아 제거함
		for(Member member : arrayList) {	// 전체 회원을 출력하는 메서드
			System.out.println(member);
		}
	}
	
	public void insertMember(Member member, int index) {	// 특정 위치에 회원 추가하기
		// index는 0보다 작거나 size+1보다 크면 "지정된 자리에 추가할 수 없습니다." 출력
		// 그렇지 않으면
		// index-1 부분에 삽입한다.
		if(index < 0 || index > arrayList.size() + 1) {
			System.out.println("지정된 자리에 추가할 수 없습니다.");
		}
		else {
			arrayList.add(index-1, member);
		}
	}
}

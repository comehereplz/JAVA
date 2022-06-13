package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		// 새로운 회원 인스턴스 생성
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서훤");
		Member memberHong = new Member(1004, "홍길동");
		// ArrayList에 회원 추가
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);

		memberArrayList.showAllMember();	// 전체 회원 출력

		memberArrayList.removeMember(memberHong.getMemberId());	// 홍길동 회원 삭제
		memberArrayList.showAllMember();	// 홍길동 회원을 삭제한 후 다시 전체 회원 출력
		
		memberArrayList.insertMember(memberHong, 1);
		memberArrayList.showAllMember();	// 홍길동 회원을 배열 1번째에 추가한 후 다시 전체 회원 출력
	}

}

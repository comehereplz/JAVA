package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();

		Member memberPark = new Member(1003, "박서훤");
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");

		memberTreeSet.addMember(memberPark);
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.showAllMember();

		Member memberHong = new Member(1003, "홍길동"); // 아이디 중복 회원 추가
		Member memberPark2 = new Member(1004, "박서훤");	// 이름 중복 회원 추가
		// memberTreeSet.addMember(memberHong);
		memberTreeSet.addMember(memberPark2);
		memberTreeSet.showAllMember();
	}

}

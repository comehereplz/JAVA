package map.treemap;

import collection.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap memberTreeMap = new MemberTreeMap();

		Member memberPark = new Member(1003, "박서훤");	// 회원 아이디 순서와 상관없이 회원 추가
		Member memberLee = new Member(1001, "이지원");
		Member memberHong = new Member(1004, "홍길동");
		Member memberSon = new Member(1002, "손민국");

		memberTreeMap.addMember(memberPark);
		memberTreeMap.addMember(memberLee);
		memberTreeMap.addMember(memberHong);
		memberTreeMap.addMember(memberSon);

		memberTreeMap.showAllMember();

		memberTreeMap.removeMember(1004);	// 회원 아이디(key 값)가 1004인 회원 삭제
		memberTreeMap.showAllMember();
	}

}

package exception;

public class IDFormatTest {
	private String userID;
	

	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) throws IDFormatException {
		if(userID == null) {
			throw new IDFormatException("아이디는 null일 수 없습니다.");
		}
		else if(userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요.");
		}
		this.userID = userID;
	}

	public static void main(String[] args) {
		IDFormatTest idTest = new IDFormatTest();
		String userId = null;
		try {
			idTest.setUserID(userId);
		} 
		catch(IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		userId = "1234567";
		try {
			idTest.setUserID(userId);;
		}
		catch(IDFormatException e) {
			
		}
	}

}

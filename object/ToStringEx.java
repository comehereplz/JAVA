package object;

class Book {
	int bookNumber;
	String bookTitle;

	Book(int bookNumber, String bookTitle) { // 책 번호와 제목을 매개변수로 입력받는 생성자
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() {
		return bookTitle + ", " + bookNumber;
	}
}

public class ToStringEx {

	public static void main(String[] args) {
		Book book1 = new Book(200, "개미");

		System.out.println(book1);
		System.out.println(book1.toString());
	}

}

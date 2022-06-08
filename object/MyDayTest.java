package object;

class MyDate {
	int day;
	int month;
	int year;

	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MyDate) {
			MyDate date = (MyDate) obj;
			if (this.day == date.day)
				return true;
			else
				return false;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return day;
	}
}

public class MyDayTest {

	public static void main(String[] args) {
		MyDate date1 = new MyDate(2, 5, 2001);
		MyDate date2 = new MyDate(2, 5, 2001);
		System.out.println(date1.equals(date2));
		System.out.println(date1.hashCode());
		System.out.println(date2.hashCode());
	}

}

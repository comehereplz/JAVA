package wrapper;

public class WrapperEx1 {

	public static void main(String[] args) {
		Integer num = new Integer(76); // 박싱
		int n = num.intValue(); // 언박싱
		System.out.println(n);
	}

}

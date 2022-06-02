package exception;

public class ArrayExceptionHanding {

	public static void main(String[] args) {
		int[] arr = new int[5];

		try {
			for (int i = 0; i <= 5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("5개를 초과했습니다.");
			System.out.println(e);
		}
	}

}

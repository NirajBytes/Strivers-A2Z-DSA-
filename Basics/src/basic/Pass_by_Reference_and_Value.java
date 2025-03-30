package basic;

public class Pass_by_Reference_and_Value {
	static int[] adding(int x, int y) {
		return new int[] { x + 1, y + 2 };
	}

	static int[] passedBy(int a, int b) {
		return adding(a, b);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = passedBy(1, 2);
		System.out.println(arr[0] + " " + arr[1]);

	}
}
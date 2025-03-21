package basic;
//Given two integers, n and m. The task is to check the relation between n and m. Return "lesser" if n < m,  "equal" if n == m, and "greater" if n > m.

public class If_else_que {
	public static String compareNM(int n, int m) {

		if (n >= m) {
			if (n == m) {
				return "equal";
			}
			return "greater";
		} else {
			return "lesser";
		}
	}

	public static void main(String[] args) {

		int n = 10;
		int m = 20;
		System.out.println(compareNM(n, m));

	}

}

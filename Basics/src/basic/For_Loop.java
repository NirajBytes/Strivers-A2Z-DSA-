package basic;

import java.util.ArrayList;

public class For_Loop {

	public static void main(String[] args) {
//
//		for (int i = 1; i <= 10; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//		}
//
		int n = 5;
		int k = 15;
		int sum = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				int m = k--;
				int pro = m * m;
				System.out.print(pro);
				while (pro != 0) {
					int rem = pro % 10;
					sum += rem;
					pro /= 10;
				}
				

			}
			list.add(sum);
			list.sort((a,b)->a-b);
			System.out.print(" \tSum Of Digits Of Line " + sum);
			sum = 0;
			System.out.print(list);
			System.out.println();
		}
	}

}

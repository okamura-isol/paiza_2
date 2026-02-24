package gitproject;

import java.util.Scanner;

public class paiza_2_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 九九の行(=列)の数
		int kukuNum = sc.nextInt();
		// 九九の行
		for (int kukuGyo = 1; kukuGyo <= kukuNum; kukuGyo++) {
			// 九九の列
			for (int kukuRetsu = 1; kukuRetsu <= kukuNum; kukuRetsu++) {
				// 九九の結果
				System.out.print(kukuGyo * kukuRetsu);
				if (kukuRetsu < kukuNum) {
					// 半角スペース
					System.out.print(" ");
				} else {
					// 改行
					System.out.println();
				}
			}
		}
	}
}

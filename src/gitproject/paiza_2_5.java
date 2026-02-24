package gitproject;

import java.util.Scanner;

public class paiza_2_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 要素の数
		int yosoNum = sc.nextInt();
		for (int suretsuGyo = 0; suretsuGyo < yosoNum; suretsuGyo++) {
			// 要素の値
			int yosoValue = sc.nextInt();
			for (int suretsuRetsu = 1; suretsuRetsu < yosoValue + 1; suretsuRetsu++) {
				System.out.print(suretsuRetsu);
				if (suretsuRetsu < yosoValue) {
					System.out.print(" ");
				} else {
					System.out.println();
				}
			}
		}
	}
}

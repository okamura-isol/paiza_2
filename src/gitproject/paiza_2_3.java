package gitproject;

import java.util.Scanner;

public class paiza_2_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 入力値
		String num = sc.nextLine();
		// 入力値の桁
		int numDigit = num.length();
		for (int i = 0; i < numDigit; i++) {
			// 自然数かつ桁数が3の倍数の場合、入力値3桁ごとにカンマ区切り
			if (i != 0 && i % 3 == 0) {
				System.out.print(",");
			}
			System.out.print(num.charAt(i));
		}
		System.out.println();
	}
}

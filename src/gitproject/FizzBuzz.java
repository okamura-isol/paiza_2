package gitproject;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int hyojiKazu = sc.nextInt();
		for (int i = 1; i <= hyojiKazu; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				// 3の倍数かつ5の倍数のとき
				System.out.println("Fizz Buzz");
			} else if (i % 3 == 0) {
				// 3の倍数のとき
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				// 5の倍数のとき
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}

	}

}

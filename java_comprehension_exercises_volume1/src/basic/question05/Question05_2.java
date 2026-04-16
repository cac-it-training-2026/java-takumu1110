package basic.question05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第8章 条件分岐
 */

public class Question05_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] numberGroup = new int[4];
		numberGroup[0] = 3;
		numberGroup[1] = 5;
		numberGroup[2] = 7;
		numberGroup[3] = 9;

		if (numberGroup[3] == 3) {
			System.out.println("4番目の要素は３です。");
		} else if (numberGroup[3] == 5) {
			System.out.println("4番目の要素は5です。");
		}
		if (numberGroup[3] == 7) {
			System.out.println("4番目の要素は7です。");
		} else {
			System.out.println("4番目の要素の値は、3、5、7以外の数値です。");

		}

		// TODO:ここに実装

	}
}

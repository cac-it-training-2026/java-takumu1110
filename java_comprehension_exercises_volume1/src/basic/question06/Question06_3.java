package basic.question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question06_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int amount = 0;
		int price = 100;
		System.out.println("鉛筆を購入しますか？");
		System.out.println("はい：0、いいえ：1");
		String choice = reader.readLine();
		int buyFlag = Integer.parseInt(choice);
		while (buyFlag == 0) {
			while (buyFlag == 0) {
				amount++;
				System.out.println("購入する鉛筆を1本増やしますか");
				System.out.println("はい：0、いいえ：1");
				choice = reader.readLine();
				buyFlag = Integer.parseInt(choice);
			}
		}
		System.out.println("購入した合計金額は、" + (amount * price) + "円です。");

	}

	// TODO:ここに実装

}

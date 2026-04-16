package basic.question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question06_4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int amountBooks = 0;
		int sellFlag = 0;
		int bookPrice = 200;
		System.out.println("本を売却します。");
		do {
			amountBooks++;
			System.out.println("売却する本の冊数を増やしますか？");
			System.out.println("はい：0、いいえ：1");
			String choice = reader.readLine();
			sellFlag = Integer.parseInt(choice);

		} while (sellFlag == 0);
		System.out.println("売却する本の冊数" + amountBooks + "冊です");
		System.out.println("売却した" + (amountBooks * bookPrice) + " 円です");

		// TODO:ここに実装

	}

}

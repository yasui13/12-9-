package enshu5;

import java.util.Scanner;

public class MultiplTable {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int times = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("1～9までの整数を1つ入力してください:");
		times = scan.nextInt();
		
		System.out.println(times + "の段");
		if(0 < times && times < 10) { //forループで計算する
			for(int i = 1;i<10;i++) { //①掛け算の値を求める　②値の表示
				int value = times * i;
				System.out.print(times + "×" + i + "=" + value + " ");
			}
		}else {
			System.out.print("無効");
		}
	}
}

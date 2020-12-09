package enshu5;

public class SumWhile {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int i = 1;
		int sum = 0;
		while(i < 101) { //iが100までループ
			sum += i; //sum = sum + i
			i++;
		}
		System.out.println("合計は" + sum);

	}

}

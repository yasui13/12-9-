package enshu5;

public class ForShape3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int i = 2;i >= 0;i--) {
			//別解
			/*
			for(int j = 2;j >= 0 + i;j--) {
				if(j == 0 + i) {
					System.out.println("*");
				}else {
					System.out.print("*");
				}
			}
			*/
			for(int j = 0;j <= 2 - i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}

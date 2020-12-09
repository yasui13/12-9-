package enshu5;

public class ForShape2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//①printlnのみ
		System.out.println("***");
		System.out.println("** ");
		System.out.println("*  ");  //別解System.out.println("***\n** \n*  ");

		System.out.println("----------------↓②");
		//②for文一つ
		for(int i= 0;i < 3;i++) {
			if(i == 0) {
				System.out.println("***");
			}else if(i == 1) {
				System.out.println("** ");
			}else {
				System.out.println("*  ");
			}
		}
		//別解
		/*for(int i= 0;i < 9;i++) {
			if(i % 3 == 2){	//2,5,8の時の処理
				if(i == 2){ //1列目の時
					System.out.println("*");
				}else{ //2,3列目
					System.out.println(" ");
				}
			}else{
				if(i/2.0 < 3.1){  //0～6の時
					System.out.print("*");
			 	}else{ //7,8の時
			 		System.out.print(" ");
			 	}
			}
		}*/

		System.out.println("----------------↓③");
		//③for文二つ
		for(int i= 0;i < 3;i++) {



			for(int j = 0;j < 3 - i;j++) {
				System.out.print("*");
			}
			System.out.println("");

		}
		//別解1
		/*for(int j = 0;j < 3 - i;j++) {
			if(j ==  2 - i) {
				System.out.println("*");
			}else {
				System.out.print("*");
			}
		}*/
		//別解2
		/*
		for(int i = 2;i >= 0;i--) {
			for(int j = 2;j >= 2 - i;j--) {
				System.out.print("*");
			}
			System.out.println("");
		}*/
	}
}



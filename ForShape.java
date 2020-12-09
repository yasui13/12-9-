package enshu5;

public class ForShape {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//①printlnのみ
		System.out.println("***");
		System.out.println("***");
		System.out.println("***");  //別解System.out.println("***\n***\n***");

		System.out.println("----------------↓②");
		//②for文一つ
		for(int i= 0;i < 3;i++) {
			System.out.println("***");
		/*別解
			for(int i= 0;i < 9;i++) {
			 if(i % 3 == 2){
			  System.out.println("*");
			 }else{
			  System.out.print("*");
			 }
			}
			 */
		}
		System.out.println("----------------↓③");
		//③for文二つ
		for(int i= 0;i < 3;i++) {
			for(int j = 0;j < 3;j++) {
				if(j < 2) { 			//jの値が0,1の時は改行が不必要
					System.out.print("*");
				}else { 				//jの値が2の時は改行が必要
					System.out.println("*");
				}
			}
		}

	}

}

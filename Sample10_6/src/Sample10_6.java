class Car {
	private int num;
	private double gas;
	
	public Car() {
		num = 0;
		gas = 0.0;
		System.out.println("車を作成しました");
	}
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
	}
	public void show() {
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
	
}


public class Sample10_6 {
	public static void main(String[] args) {
		Car car1;
		System.out.println("car1を宣言しました。");
		car1 = new Car();
		car1.setCar(1234, 20.5);
		
		Car car2;
		System.out.println("car2を宣言しました。");
		
		car2 = car1;
		System.out.println("car2にcar1を代入しました。");
		
		System.out.println("car1を探す");
		car1.show();
		System.out.println("car2を探す");
		car2.show();

	}

}

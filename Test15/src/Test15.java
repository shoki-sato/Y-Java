class Car implements Runnable{
	
	private String name;
	
	public Car(String nm) {
		name = nm;
	}
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(name + "の処理をしています");
		}
	}
}

class Car1 implements Runnable{
	private String name;
	
	public Car1(String nm) {
		name = nm;
	}
	
	public void run() {
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(name + "の処理をしています");
			}
			catch(InterruptedException e) {
				
			}
		}
	}
}

public class Test15 {
	public static void main(String[] args) {
		Car car1 = new Car("1号車");
		Thread th1 = new Thread(car1);
		th1.start();
		Car car2 = new Car("2号車");
		Thread th2 = new Thread(car2);
		th2.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("main()の処理をしています");
		}
		
		
		Car1 car11 = new Car1("1号車");
		Thread th11 = new Thread(car11);
		th11.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("main()の処理をしています");
		}
	}
		
		
		
	}



package part01.sec01.exam01;

public class Car_03 {
	int speed;
	
	void run() {
		System.out.println(speed+"으로 달립니다.");
	}
	
	public static void main(String[] args) {
		Car_03 myCar=new Car_03();
		myCar.speed=60;
		myCar.run();

	}

}

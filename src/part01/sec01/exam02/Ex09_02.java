package part01.sec01.exam02;

class Car2{
	/*private*/ String color;  //private = 직접접근x, 메소드를 통해서 접근해라. (캡슐화)
	int speed;
	
	void upSpeed(int value) {
		speed = speed + value;
	}
	
	void downSpeed(int value) {
		speed = speed - value;
	}
	
	String getColor() { // get:얻다,가져오다 / 메소드 앞에 get이 오면 무언가를 가져오는 역할
		color = "검정";	
		return color;
	}
	
	int getSpeed() {
		speed = 9999;
		return speed;
	}
}


public class Ex09_02 {

	public static void main(String[] args) {
		Car2 myCar1=new Car2();
		myCar1.color="빨강";
		myCar1.speed=0;

		myCar1.upSpeed(30);
		System.out.println("자동차1의 색상은"+myCar1.color+"이며, 현재 속도는"+myCar1.speed+"km 입니다.");
		System.out.println("자동차1의 색상은"+myCar1.getColor()+"이며, 현재속도는"+myCar1.getSpeed()+"km 입니다.");
	}

}

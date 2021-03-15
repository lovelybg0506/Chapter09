package part01.sec01.exam02;

class Car6{
	private String color;
	private int speed;
	

	Car6(String color,int speed){		// 생성자를 직접 만들면 기본 생성자를 컴파일러가 만들지 않는다.
		this.color=color;
		this.speed=speed;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
}

public class Ex09_06 {

	public static void main(String[] args) {
//		Car6 myCar1=new Car6(); //기본생성자 호출하는 코드
		Car6 myCar1=new Car6("빨강",0);
		Car6 myCar2=new Car6("파랑",30);

		System.out.println("자동차1의 색상은"+myCar1.getColor()+"이며,현재 속도는"+myCar1.getSpeed()+"km입니다.");
		System.out.println("자동차2의 색상은"+myCar2.getColor()+"이며,현재 속도는"+myCar2.getSpeed()+"km입니다.");

	}

}

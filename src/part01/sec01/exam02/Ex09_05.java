package part01.sec01.exam02;

class Car5{
	private String color;
	private int speed;
	
//	Car5(){ // 기본생성자 : 아무일도 하지않는 생성자
//		System.out.println("Java");
//	}
			// 생성자 : 무조건 실행,만약 없다면 컴파일러가 만들어서 삽입(단,우리 눈에 안보임)
			// 생성자는 클래스 이름과 같아야 한다.
			// 생성자도 메소드의 한 종류이다.(호출해야 작동한다)
			// 반환타입이 존재하지 않는다
			// 생성자는 주로 객체 생성시 자동 호출되며 객체를 초기화 할 때 사용한다.
	
	Car5(){
		color="빨강";
		speed=0;
	}
	
	String getColor() {
		return color;
	}
	
	int getSpeed() {
		return speed;
	}
	
	void setColor(String color) {
		this.color=color;
	}
	
	void setSpeed(int speed) {
		this.speed=speed;
	}
	
}

public class Ex09_05 {

	public static void main(String[] args) {
		Car5 myCar1=new Car5(); // Car5() : 생성자 호출(메소드)
	
		System.out.println("자동차1의 색상은"+myCar1.getColor()+"이며,현재 속도는"+myCar1.getSpeed()+"km입니다.");
		
		
		Car5 myCar2=new Car5();
	
		myCar2.setColor("검정");
		myCar2.setSpeed(10);
		
		System.out.println("자동차2의 색상은"+myCar2.getColor()+"이며,현재 속도는"+myCar2.getSpeed()+"km입니다.");
		
	}

}

package part01.sec02.exam01;

class Car{
	String color;
	String gearType;
	int door;
	
	Car(){
		
	}
	
	Car(String c,String g, int d){
		color = c;
		gearType = g;
		door = d;
	}
}

public class CarTest_05 {

	public static void main(String[] args) {
		Car c1=new Car();
		c1.color="white";
		c1.gearType="auto";
		c1.door=4;
		
		Car c2=new Car("white","auto",4);
		
		System.out.println("c1의 색상= "+c1.color+",c1의 gearType= "+c1.gearType+"c1의 door= "+c1.door);
		System.out.println("c2의 색상= "+c2.color+",c2의 gearType= "+c2.gearType+"c2의 door= "+c2.door);
	}

}

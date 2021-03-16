package part01.sec02.exam01;

class Car2{
	String color;
	String gearType;
	int door;

	Car2(){
//		this.color="white";
//		this.gearType="auto";
//		this.door=4;
		this("white","auto",4);
	}
	
	Car2(String color){
//		this.color=color;
//		this.gearType="auto";
//		this.door=4;
		this(color,"auto",4);
	}
	
	Car2(String color,String gearType,int door){
		this.color=color;
		this.gearType=gearType;
		this.door=door;
	}
	
}

public class CarTest_06 {
		
	public static void main(String[] args) {
		Car2 c1=new Car2();
		Car2 c2=new Car2("blue");
		
		System.out.println("c1의 color= "+c1.color+",gearType= "+c1.gearType+",door= "+c1.door);
		// white,auto,4
		System.out.println("c2의 color= "+c2.color+",gearType= "+c2.gearType+",door= "+c2.door);
		// blue,auto,4
	}
}   

package part01.sec01.exam03;

class Pet2{
	private String type;
	private int age;
	
	public void move() {
		System.out.println(this.type+"가 움직입니다.");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

}



public class Problem09_02 {

	public static void main(String[] args) {
		Pet2 pet1=new Pet2();
		pet1.setType("강아지");
		pet1.setAge(8);
		
		Pet2 pet2=new Pet2();
		pet2.setType("고양이");
		pet2.setAge(13);
		
		pet1.move();
		pet2.move();
		
		System.out.println(pet1.getType()+"는 "+pet1.getAge()+"개월입니다.");
		System.out.println(pet2.getType()+"는 "+pet2.getAge()+"개월입니다.");


	}

}

package part01.sec02.exam06;

public class PhysicalInfo {
	String name;
	int age;
	float height,weight;
	
	PhysicalInfo(String name,int age,float height,float weight){
		this.name=name;
		this.age=age;
		this.height=height;
		this.weight=weight;
	}
	
	// method overloading(메소드의 이름은 같지만, 파라미터 변수의 수와 값이 다른 것)
	void update(int age) {
		this.age=age;
	}
	
	void update(int age,float height) {
		this.age=age;
		this.height=height;
	}

	void update(int age,float height,float weight) {
		this.age=age;
		this.height=height;
		this.weight=weight;
		
	}
	
}

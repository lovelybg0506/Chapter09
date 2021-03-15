package part01.sec02.exam01;

class SubscriberInfo{ 										//설계도
	String name,id,password;
	String phoneNo,address;
	
	SubscriberInfo(String name,String id,String password){
		this.name=name;
		this.id=id;
		this.password=password;
	}
	
	SubscriberInfo(String name,String id,String password,String phoneNo,String address){
//		this.name=name;
//		this.id=id;
//		this.password=password;
		this(name,id,password); // 생성자 호출 this()
		this.phoneNo=phoneNo;
		this.address=address;
	}

	void changePassword(String password) {
		this.password=password;
	}

	void setPhoneNo(String phoneNo) {
		this.phoneNo=phoneNo;
	}
	
	void setAddress(String address) {
		this.address=address;
	}
}

public class ConstExample2_03 {

	public static void main(String[] args) {		//실행
		SubscriberInfo obj1,obj2;
		obj1 = new SubscriberInfo("연흥부","poorman","zebi");
		obj2 = new SubscriberInfo("연놀부","richman","money","02-000-0000","타워팰리스");
		
		printSubscriberInfo(obj1);
		printSubscriberInfo(obj2);
		
	}
	
	public static void printSubscriberInfo(SubscriberInfo obj) {
		
		System.out.println("이름: "+obj.name);
		System.out.println("아이디: "+obj.id);
		System.out.println("패스워드: "+obj.password);
		System.out.println("전화번호: "+obj.phoneNo);
		System.out.println("주소: "+obj.address);
		System.out.println();
	}
	
}

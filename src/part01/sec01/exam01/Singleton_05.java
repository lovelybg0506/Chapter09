package part01.sec01.exam01;

public class Singleton_05 {

	public static void main(String[] args) {
		
//		Singleton_04 obj1 = new Singleton_04();
//		Singleton_04 obj2 = new Singleton_04();
		
		Singleton_04 obj1 = Singleton_04.getInstance();
		Singleton_04 obj2 = Singleton_04.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
			
		}else {
			System.out.println("다른 Singleton 객체입니다.");
		}
		
	}

}

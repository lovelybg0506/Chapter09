package part01.sec01.exam03;

import java.util.Scanner;

class MyName{
	private String name;
	
	MyName(String name){
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
}

public class Problem09_03 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("이름을 입력하세요: ");
		String name=s.next();
		
		MyName ap=new MyName("홍길동");
		if(name.equals(ap.getName())) {
			System.out.println("입력한 이름과 같습니다.");
		}
		
		s.close();
		
	}

}

package part01.sec02.exam09;

import java.util.Scanner;

class Member{
	private String name;
	private String tel;

	Member(String name,String tel){
		this.name=name;
		this.tel=tel;
	}
	
	public void setTel(String tel) {
		this.tel=tel;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTel() {
		return tel;
	}
		
	void disp() {
		System.out.println(name+"님의 전화번호는 ("+tel+") 입니다.");
	}
	
}

public class Problem_02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("회원수 입력: ");
		int inwon=in.nextInt();
		//입력 받은 수 만큼 클래스 배열을 만들어서 이름과 전화번호를 입력받아 출력하세요.

		Member mb[] = new Member[inwon];
		for(int i = 0; i<mb.length; i++) {
			System.out.println(i+1+"번째 이름:");
			String name = in.next();
			System.out.println(i+1+"번째 전화번호");
			String tel = in.next();
			mb[i] = new Member(name,tel); //참조값(주소값)
			
		}
		
		for(int i=0;i<mb.length;i++) {
			mb[i].disp();
			
		}
		
	}
}

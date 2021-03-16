package part01.sec02.exam07;

class InstCnt2{
	static int instNum=100; 	// static 변수는 객체가 생성되기 이전에 별도의 메모리 공간에 할당.

	InstCnt2(){		// 생성자 = 객체가 만들어질때 1순위로 작동함, 만들어만놓고 객체를 생성하지 않아서 작동하지않은것.
		instNum++;
		System.out.println("인스턴스 생성: "+instNum);
		
	}
}

/*
 * static 변수의 초기화 시점?
 * JVM에 의해서 클래스가 메모리 공간에 올라가는 시점
 */

public class StaticValNoInst_05 {

	public static void main(String[] args) {
		InstCnt2.instNum-=15;	// static붙은 변수는 객체생성을 하지 않아도 쓸수있다.
		System.out.println(InstCnt2.instNum);
		
	}

}

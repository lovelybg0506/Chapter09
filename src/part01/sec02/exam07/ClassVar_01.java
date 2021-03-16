package part01.sec02.exam07;

/*
 * static 으로 선언된 변수는 변수가 선언된 클래스의 모든 객체가 공유하는 변수이다.
 * static 으로 선언된 변수는 메모리 공간에 하나만 존재하며 어디서나 접근이 가능한 변수이다.
 * 단, 어디서나 접근이 가능하려면 static 변수도 public으로 선언 되어야 한다.
 * static 으로 선언 가능한 것은 정적필드, 정적메소드, 정적초기화 블록이 있다.
 * 
 */

class InstCnt{
//	static int instNum=0;
	int instNum=0;
	
	public InstCnt() {
		instNum++;
		System.out.println("인스턴스 생성: "+instNum);
	}
}

public class ClassVar_01 {

	public static void main(String[] args) {
		InstCnt cnt1 = new InstCnt();
		InstCnt cnt2 = new InstCnt();
		InstCnt cnt3 = new InstCnt();

	}

}

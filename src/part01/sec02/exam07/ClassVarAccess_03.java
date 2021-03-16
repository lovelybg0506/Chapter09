package part01.sec02.exam07;

class AccessWay{
	static int num=0; // 'static'들은 공유가 가능하고, 다른 메모리공간에 이미 만들어져있음.(main 포함)
	int num2;	// static이 안붙은 일반 필드는 객체를 생성한 후 접근해야함.
	
	AccessWay(){
		incrCnt();
	}
	
	public void incrCnt() {
		num++;
		num2++;
	}
	
}

public class ClassVarAccess_03 {

	public static void main(String[] args) {
		AccessWay way = new AccessWay();
		System.out.println(way.num);
//		way.num++;
//		System.out.println(way.num);
		

		System.out.println(AccessWay.num);	// num앞에 static이 붙어서 class통째로 접근이 가능하다?
		AccessWay.num++;
		System.out.println(AccessWay.num);
//		System.out.println(AccessWay.num++);
//		System.out.println(AccessWay.num);
		
		System.out.println(way.num2);	// 일반 field는 반드시 객체를 생성해줘야함.
	}

}

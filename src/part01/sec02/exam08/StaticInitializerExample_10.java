package part01.sec02.exam08;

class HundredNumbers{
	static int arr[];	// class에서 배열도 하나의 field로 만들수 있다.

	// 정적 초기화 블록	,靜寂  조용할 정, 고요한,쓸쓸할 적
	static {		// 이 안에다 arr[]를 초기화시키겠다.
		arr = new int[100];
		for(int cnt=0; cnt<100; cnt++) {
			arr[cnt]=cnt;
		}
	}
}


public class StaticInitializerExample_10 {

	public static void main(String[] args) {
		System.out.println(HundredNumbers.arr[35]);
		System.out.println(HundredNumbers.arr[27]);
		System.out.println(HundredNumbers.arr[0]);
		
	}

}

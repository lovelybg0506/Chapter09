package part01.sec02.exam01;

class Data1{
	int value;
	
	Data1(){
		
	}
}

class Data2{
	int value;
	//Data2(){
	
	//}
	Data2(int x){
		value=x;
	} // 생성자를 만들면 컴파일러는 기본 생성자를 만들지 않는다.
}

class Data3{
	int value;
	
	Data3(int x){	// 객체 생성시 제일 먼저 실행.
		value=x;
		System.out.println("생성자: "+value);
	}
}

public class ConstructorTest_04 {

	public static void main(String[] args) {
		Data1 data1=new Data1();
//		Data2 data2=new Data2(0);
		Data3 data3=new Data3(100); // 생성자 객체 만들어 질 때 1순위 호출

		System.out.println(data3.value);
	}

}

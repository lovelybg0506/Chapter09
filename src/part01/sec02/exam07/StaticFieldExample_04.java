package part01.sec02.exam07;

class LimitedValue{
	final static int UPPER_LIMIT=100000;  // final : 이 값은 수정할수없다.
	int value;
	
	void setValue(int value) {
		if(value<UPPER_LIMIT) {
			this.value=value;
		}else {
			this.value=UPPER_LIMIT;
		}
	}
}

public class StaticFieldExample_04 {

	public static void main(String[] args) {
		LimitedValue v=new LimitedValue();
		v.setValue(200000);
		System.out.println("v.value: "+v.value);
		System.out.println("상한값: "+LimitedValue.UPPER_LIMIT);
//		LimitedValue.UPPER_LIMIT=200000; //(error) final이라 값을 바꿀 수 없음.
	}

}

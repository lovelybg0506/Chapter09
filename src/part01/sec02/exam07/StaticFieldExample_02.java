package part01.sec02.exam07;

class Accumulator {
	int total = 0;
	static int grandTotal = 0;	// 객체 생성과 상관없이 사용, 객체가 없어져도 메모리에 유지한다.(static이라)
	
	void accumulate(int amount) {
		total+=amount;
		grandTotal+=amount;
		
	}
	
}

public class StaticFieldExample_02 {

	public static void main(String[] args) {
		Accumulator obj1 = new Accumulator();
		Accumulator obj2 = new Accumulator();
		
		obj1.accumulate(10);
		obj2.accumulate(20);
		
		System.out.println("obj1.total= "+obj1.total);
		System.out.println("obj1.grandtotal= "+obj1.grandTotal);
		
		System.out.println("obj2.total= "+obj2.total);
		System.out.println("obj2.grandtotal= "+obj2.grandTotal);
		
		
		
	}

}

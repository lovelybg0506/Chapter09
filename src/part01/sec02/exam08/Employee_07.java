package part01.sec02.exam08;

public class Employee_07 { // 직원
	private int myMoney;
		
	public Employee_07(int money) {
		myMoney=money;
	}
	

	public void earnMoney(int money) {   	//	사장으로부터 돈을 받는 행위
		myMoney+=money;
		
	}
	
	public void showMyMoney() {
		System.out.println(myMoney);
	}
	

}

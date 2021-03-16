package part01.sec02.exam08;

public class Employer_06 { // 고용주
	private int myMoney;
	
	public Employer_06(int money) {
		myMoney=money;
	}
	
	public void payForWork(Employee_07 emp,int money) {  // 직원에게 돈을 주는 행위
		if(myMoney<money)
			return;
		emp.earnMoney(money);
		myMoney-=money;
		
	}
	
	public void showMyMoney() {
		System.out.println(myMoney);
	}
	
}

package part01.sec02.exam05;

public class Account {
	String accountNo; // 계좌번호
	String ownerName; // 예금주
	int balance; // 잔액
	
	Account(String accountNo,String ownerName,int balance){
		this.accountNo=accountNo;
		this.ownerName=ownerName;
		this.balance=balance;
	}
	
	public void deposit(int amount) { // 예금
		balance+=amount;
	}
	
	public int withdraw(int amount) { // 인출
		if(balance<amount) {
			System.out.println("잔액부족");
			
			return 0;	// 종료하는 의미도있다.
		}else {
			balance-=amount;
		}
		
		return amount;
	}
}

package part01.sec02.exam04;

public class FruitBuyer { // 고객
	int myMoney=5000;
	int numOfApple=0;
	
	public void buyApple(FruitSeller seller,int money) { // 사과를 사는 행위
		numOfApple=seller.saleApple(money);
		myMoney-=money;
	}
	
	public void showBuyResult() {
		System.out.println("현재 잔액: "+myMoney);
		System.out.println("사과 갯수: "+numOfApple);
	}
	
}

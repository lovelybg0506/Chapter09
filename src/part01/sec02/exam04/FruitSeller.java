package part01.sec02.exam04;

public class FruitSeller { // 사과장수
	int numOfApple = 20;
	int myMoney = 0;
	final int APPLE_PRICE = 1000; // final : 고정된값을 갖겠다.(APPLE_PRICE라는 필드값은 1000으로 고정,변수이름을 대문자로)

	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;

		return num;
	}

	public void showSaleResult() {
		System.out.println("남은 사과: " + numOfApple);
		System.out.println("판매 수익: " + myMoney);
	}

}

package part01.sec02.exam04;

public class FruitSalesMain { 

	public static void main(String[] args) {
		FruitSeller seller = new FruitSeller();
		FruitBuyer buyer = new FruitBuyer();
		
		buyer.buyApple(seller,2000); // 사과 장수 한테 2000원어치를 산다
		
		System.out.println("과일 판매자의 현재 상황");
		seller.showSaleResult();
		
		System.out.println("과일 구매자의 현재 상황");
		buyer.showBuyResult();
	}

}

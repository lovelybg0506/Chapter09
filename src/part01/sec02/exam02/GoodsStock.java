package part01.sec02.exam02;

public class GoodsStock {
	String goodsCode;
	int stockNum;
	
	void addStock(int amount) {
		stockNum += amount;
	}
	
	int subtractStock(int amount) {
		if(stockNum<amount)
			return 0;
		stockNum-=amount;
		
		return amount;
	}
	
}

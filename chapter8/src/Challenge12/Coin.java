package Challenge12;

import java.util.Random;

public class Coin {
	private int coin;
	public void flipCoin() {
		Random a = new Random();
		this.coin = a.nextInt(2)+1;
	}
	public int getCoin() {
		return this.coin;
	}
}

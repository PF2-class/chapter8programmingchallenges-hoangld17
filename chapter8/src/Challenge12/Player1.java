package Challenge12;

public class Player1 {
	private int[] player;
	public Player1(int number) {
		if (number<2)
			player = new int[2];
		else player = new int[number];
	}
	public Player1() {
		player = new int[2];
	}
	
	public void lostOrGain(Coin a, int i,int guess) {
		if (guess==a.getCoin())
			player[i]++;
		 else if (player[i]>0)
			player[i]--;
		if (a.getCoin()==1)
			System.out.println("The coin is face up.");
		else System.out.println("The coin is face down.");
		System.out.println("Player "+(i+1)+" has "+player[i]+" points.");
	}
	public int[] getPlayer() {
		return player;
	}

	
}

package Challenge11;


public class Player {
	private int[] player;
	final static int pointStart=50;
	public Player(int number) {
		if (number<2)
			player = new int[2];
		else player = new int[number];
		for (int i=0;i<player.length;i++)
			player[i]=50;
	}
	public Player() {
		player = new int[2];
		player[0]=50;
		player[1]=50;
	}
	public int[] getPlayer() {
		return player;
	}
	public void lostOrGain(Die a, int i) {
		if (player[i]>a.getDice())
			player[i]-=a.getDice();
		else player[i]+=a.getDice();
		System.out.println("The dice is "+a.getDice()+".");
		System.out.println("Player "+(i+1)+" has "+player[i]+" points.");
		
	}
}

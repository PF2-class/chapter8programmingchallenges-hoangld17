package Challenge11;

import java.util.Random;

public class Die {
	private int dice;
	public int getDice() {
		return dice;
	}
	public void rollDice() {
		Random a = new Random();
		this.dice=a.nextInt(6)+1;
	}
}

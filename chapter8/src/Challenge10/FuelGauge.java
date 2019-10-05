package Challenge10;

public class FuelGauge {
	private int fuelCurrent;
	final static int maxFuel=15;
	public FuelGauge() {
		fuelCurrent=0;
	}
	public FuelGauge(int fuel) {
		if (fuel<maxFuel)
		this.fuelCurrent=fuel;
		else this.fuelCurrent=maxFuel;
	}
	public int getFuelCurrent() {
		return this.fuelCurrent;
	}
	public void addFuel() {
		this.fuelCurrent++;
	}
	public void lostFuel() {
		this.fuelCurrent--;
	}
	public FuelGauge(FuelGauge a) {
		this.fuelCurrent=a.fuelCurrent;
	}
	
}

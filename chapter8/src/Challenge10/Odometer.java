package Challenge10;

public class Odometer {
	private int mileage;
	final static int MPG=24;
	final static int maxMileage = 999999;
	static int countMileage =0;
	private FuelGauge fuel;
	public Odometer(int mileage, FuelGauge fuel) {
		super();
		this.mileage = mileage;
		this.fuel = new FuelGauge(fuel);
	}
	public FuelGauge getFuel() {
		return fuel;
	}
	public void simulateFuel() {
		if (mileage<maxMileage) 
			mileage++;
		else mileage=0;
		countMileage++;
		if (countMileage%24==0)
			fuel.lostFuel();
		System.out.println("The current mileage: "+mileage+" miles.");
		if (fuel.getFuelCurrent()==0)
			System.out.println("Out of fuel!");
		else System.out.println("The current fuel: "+fuel.getFuelCurrent()+" gallons.");
		
	}
}

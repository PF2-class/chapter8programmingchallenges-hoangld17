package Challenge10;

public class CarInstrumentSimulator {

	public static void main(String[] args) {
		FuelGauge fuel = new FuelGauge();
		Odometer meter = new Odometer(0, fuel);
		while (meter.getFuel().getFuelCurrent()<FuelGauge.maxFuel) {
			meter.getFuel().addFuel();
		}
		while (meter.getFuel().getFuelCurrent()>0)
			meter.simulateFuel();
	}

}

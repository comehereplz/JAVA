package myTest;

public class CarTest {

	public static void main(String[] args) {
		Bus bus = new Bus();
		AutoCar autoCar = new AutoCar();
		
		bus.run();
		autoCar.run();
		
		bus.refuel();
		autoCar.refuel();
		
		bus.stop();
		autoCar.stop();
		
		bus.takePasenger();
		autoCar.load();
	}
}

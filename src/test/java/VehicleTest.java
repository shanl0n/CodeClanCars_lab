import com.codebase.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleTest {
	 Vehicle vehicle;
	 Engine engine;
	 Gearbox gearbox;
	 Tyres tyres;


	 @Before
	public void before () {
		 engine = new Engine(CarType.ELECTRICCAR);
		 gearbox = new Gearbox(6);
		 tyres = new Tyres("Pirelli");
		 vehicle = new Vehicle(engine, tyres, gearbox, 299.99, "Blue");
	}

	@Test
	public void hasEngine() {
		 assertEquals(engine, vehicle.getEngine());
	 }

	@Test
	public void hasTyres() {
		 assertEquals(tyres, vehicle.getTyres());
	 }

	@Test
	public void hasGearbox() {
		 assertEquals(gearbox, vehicle.getGearbox());
	 }

	@Test
	public void hasPrice() {
		 assertEquals(299.99, vehicle.getPrice(), 0.00);
	}

	@Test
	public void hasColour() {
		 assertEquals("Blue", vehicle.getColour());
	}




}

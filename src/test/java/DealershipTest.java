import com.codebase.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {
	Dealership dealership;
	Vehicle vehicle;
	Engine engine;
	Gearbox gearbox;
	Tyres tyres;

	@Before
	public void before() {
		engine = new Engine(CarType.ELECTRICCAR);
		gearbox = new Gearbox(6);
		tyres = new Tyres("Pirelli");
		vehicle = new Vehicle(engine, tyres, gearbox, 299.99, "Blue");
		ArrayList<Vehicle> stock = new ArrayList<>();
		stock.add(vehicle);
		dealership = new Dealership(10_000, stock);
	}

	@Test
	public void hasTill() {
		assertEquals(10_000.00, dealership.getTill(), 0.0);
	}

	@Test
	public void hasStock() {
		assertEquals(1, dealership.getStock().size());
	}
}

import com.codebase.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

	Customer customer;

	@Before
	public void before() {
		customer = new Customer(10000.00);
	}

	@Test
	public void hasMoney() {
		assertEquals(10000.00, customer.getMoney(), 0.00);
	}
}

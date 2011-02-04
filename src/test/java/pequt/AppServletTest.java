package pequt;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AppServletTest {
	private AppServlet dut;
	
	@Before
	public void setUp() {
		dut = new AppServlet();
	}
	
	@Test
	public void hello() {
		assertEquals("Hello", dut.hello());
	}
}
package pequt;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AppTest {
	private App dut;
	
	@Before
	public void setUp() {
		dut = new App();
	}
	
	@Test
	public void hello() {
		assertEquals("Hello", dut.hello());
	}
}
package pequt;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import pequt.controller.InputController;

public class InputControllerTest {
	private InputController dut;

	@Before
	public void setUp() {
		dut = new InputController();
	}
	
	@Test
	public void req() throws Exception {
		assertEquals("/WEB-INF/jsp/input.jsp", dut.execute().getViewName());
	}
}
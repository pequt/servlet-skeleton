package pequt;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class SimpleParamControllerTest {
	private SimpleParamController dut;
	
	@Before
	public void setUp() {
		dut = new SimpleParamController();
	}

	@Test
	public void execute() {
		Map<String, Object> result = dut.execute("hello").getModel();
		assertEquals("hello", result.get("message"));
	}
	
	@Test
	public void execute_default() throws Exception {
		Map<String, Object> result = dut.execute(null).getModel();
		assertEquals("가나다", result.get("message"));
	}
}
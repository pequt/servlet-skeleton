package pequt;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AppControllerTest {
	private AppController dut;
	@Mock private HttpServletRequest req;
	
	@Before
	public void setUp() {
		dut = new AppController();
	}

	@Test
	public void execute() {
		when(req.getParameter("m")).thenReturn("hello");
		Map<String, Object> result = dut.execute(req).getModel();
		assertEquals("hello", result.get("message"));
	}
	
	@Test
	public void execute_default() throws Exception {
		Map<String, Object> result = dut.execute(req).getModel();
		assertEquals("가나다", result.get("message"));
	}
}
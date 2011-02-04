package pequt;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AppControllerTest {
	private AppController dut;
	@Mock private HttpServletRequest req;
	@Mock private HttpServletResponse resp;
	
	@Before
	public void setUp() {
		dut = new AppController();
	}

	@Test
	public void handleRequest() throws Exception {
		when(req.getParameter("m")).thenReturn("hello");

		Map<String, Object> result = dut.handleRequest(req, resp).getModel();
		assertEquals("hello", result.get("message"));
	}
	
	@Test
	public void handleRequest_default() throws Exception {
		Map<String, Object> result = dut.handleRequest(req, resp).getModel();
		assertEquals("가나다", result.get("message"));
	}
}
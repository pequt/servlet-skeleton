package pequt;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

@Controller
@RequestMapping("/app")
public class AppController extends AbstractController {
	@Override
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		return handleRequestInternal(req, resp);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView input(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		return new ModelAndView("/WEB-INF/jsp/input.jsp");
	}
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String m = StringUtils.defaultIfBlank(request.getParameter("m"), "가나다");

		Map<String, Object> model = new HashMap<String, Object>();
		model.put("message", m);
		return new ModelAndView("/WEB-INF/jsp/app.jsp", model);
	}
}
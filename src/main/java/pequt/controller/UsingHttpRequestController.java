package pequt.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/usingHttpRequest")
public class UsingHttpRequestController {
	@RequestMapping
	public ModelAndView execute(HttpServletRequest req) {
		// get parameter from HttpServletRequest
		String m = StringUtils.defaultIfBlank(req.getParameter("m"), "You didn't provide parameter!");

		// result model
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("message", m);
		return new ModelAndView("/WEB-INF/jsp/app.jsp", model);
	}
}
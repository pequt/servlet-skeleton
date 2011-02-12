package pequt.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/simpleParam")
public class SimpleParamController {
	@RequestMapping
	public ModelAndView execute(String m) {
		// Parameter "m" is AUTOMATICALLY passed into this method - Spring 3 MVC Magic hahaha!
		m = StringUtils.defaultIfBlank(m, "");
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("message", m);
		return new ModelAndView("/WEB-INF/jsp/app.jsp", model);
	}
}
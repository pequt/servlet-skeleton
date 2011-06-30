package pequt.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/simpleparam")
public class SimpleParamController {
	@RequestMapping
	public ModelAndView execute(String m) {
		// method parameter m: passed by spring mvc automatically
		m = StringUtils.defaultIfBlank(m, "You didn't provide parameter!");

		// result model
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("message", m);
		return new ModelAndView("/WEB-INF/jsp/app.jsp", model);
	}
}
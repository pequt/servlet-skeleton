package pequt;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/interceptedSimpleParam")
public class InterceptedSimpleParamController {
	@RequestMapping
	public ModelAndView execute(String m) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("message", m);
		return new ModelAndView("/WEB-INF/jsp/app.jsp", model);
	}
}
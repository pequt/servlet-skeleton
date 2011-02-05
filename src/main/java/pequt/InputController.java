package pequt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/in")
public class InputController {
	@RequestMapping
	public ModelAndView execute() {
		return new ModelAndView("/WEB-INF/jsp/input.jsp");
	}
}
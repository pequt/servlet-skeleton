package pequt.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pequt.service.CachedMyService;

@Controller
@RequestMapping("/cached")
public class CachedController {
	@Autowired CachedMyService service;
	
	@RequestMapping
	public ModelAndView execute() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("message", service.currentTime());
		return new ModelAndView("/WEB-INF/jsp/app.jsp", model);
	}
}
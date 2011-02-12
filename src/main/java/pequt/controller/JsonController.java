package pequt.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pequt.service.JsonService;

@Controller
@RequestMapping("/json")
public class JsonController {
	@Autowired JsonService service;
	
	@RequestMapping
	public ModelAndView execute() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("num", 12345);
		map.put("string", "string");
		map.put("bool", true);
		
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("message", service.jsonFromMap(map));
		return new ModelAndView("/WEB-INF/jsp/app.jsp", model);
	}
}
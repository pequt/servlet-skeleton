package pequt.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/paramobject")
public class ParamObjectController {
	@RequestMapping
	public ModelAndView execute(ParamObject p) {
		// method parameter p: will handled by spring mvc automatically

		// result model
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("message", p.getM());
		return new ModelAndView("/WEB-INF/jsp/app.jsp", model);
	}

	// instance of this class will be created by every call
	static class ParamObject {
		private static Logger logger = LoggerFactory.getLogger(ParamObject.class);
		
		ParamObject() {
			logger.info("parameter object created. memory hash = {}", this);
		}
		
		private String m = "m parameter didn't passed!";

		public String getM() {
			return m;
		}
		
		// when "m" parameter is passed, spring mvc will automatically call this method.
		// "m" parameter was not passed, then this method will not be called.
		public void setM(String m) {
			this.m = StringUtils.defaultIfBlank(m, "m parameter passed, but it was blank!");
		}
	}
}
package pequt;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MyInterceptor extends HandlerInterceptorAdapter {
	private static Logger logger = LoggerFactory.getLogger(MyInterceptor.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		logger.debug("in the inteceptor...");
		if (StringUtils.isBlank(request.getParameter("m"))) {
			logger.debug("no m paremter! redirecting...");
			response.sendRedirect("http://www.google.co.kr");
			return false;
		}
		return true;
	}
}
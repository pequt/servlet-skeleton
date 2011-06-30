package pequt.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MyInterceptor extends HandlerInterceptorAdapter {
	private static Logger logger = LoggerFactory.getLogger(MyInterceptor.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		// servlet-level filter. NEVER same level with Struts2 interceptor 
		logger.info("Servlet-level class MyInteceptor: just wanted to log something T_T");
		return true;
	}
}
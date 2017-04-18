package evolution.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AnotherFilter implements Filter {
	@Override
	public void destroy() {
		System.out.println("AnotherFilter has been destroyed.");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		String parameter = request.getParameter("parameter");
		System.out.println("AnotherFilter : The request parameter is " + parameter + ".");
		filterChain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("AnotherFilter has been initialized.");
	}
}

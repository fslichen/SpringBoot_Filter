package evolution.configuration;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import evolution.filter.AnotherFilter;
import evolution.filter.AnyFilter;

@Configuration
public class AnyConfiguration {
	@Bean// Define a Servlet by creating a FilterRegistrationBean.
	public FilterRegistrationBean anyFilterRegistration() {
	    FilterRegistrationBean registration = new FilterRegistrationBean();
	    registration.setFilter(new AnyFilter());
	    registration.addUrlPatterns("/*");// URL Pattern
	    registration.addInitParameter("anyName", "anyValue");
	    registration.setName("anyFilter");// Filter Name
	    registration.setOrder(1);// Lower number corresponds to higher priority.
	    return registration;
	} 
	
	@Bean
	public FilterRegistrationBean anotherFilterRegistration() {
	    FilterRegistrationBean registration = new FilterRegistrationBean();
	    registration.setFilter(new AnotherFilter());
	    registration.addUrlPatterns("/*");
	    registration.addInitParameter("anyName", "anyValue");
	    registration.setName("anotherFileter");
	    registration.setOrder(2);
	    return registration;
	} 
}

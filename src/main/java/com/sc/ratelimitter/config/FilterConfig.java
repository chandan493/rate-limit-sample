package com.sc.ratelimitter.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sc.ratelimitter.filter.RequestThrottleFilter;

@Configuration
public class FilterConfig {

	@Bean
	public FilterRegistrationBean<RequestThrottleFilter> rateFilterForEmployee() {
		FilterRegistrationBean<RequestThrottleFilter> registrationBean = new FilterRegistrationBean<RequestThrottleFilter>();
		RequestThrottleFilter rtf = new RequestThrottleFilter();
		registrationBean.setFilter(rtf);
		registrationBean.setName("ratefilter");
		registrationBean.addUrlPatterns("/customer/*");
		registrationBean.setOrder(2);
		return registrationBean;
	}
	
/**	@Bean
	public FilterRegistrationBean<RequestThrottleFilter> rateFilterForOrg() {
		FilterRegistrationBean<RequestThrottleFilter> registrationBean = new FilterRegistrationBean<RequestThrottleFilter>();
		RequestThrottleFilter rtf = new RequestThrottleFilter(4);
		registrationBean.setFilter(rtf);
		registrationBean.setName("orderfilter");
		registrationBean.addUrlPatterns("/order/*");
		registrationBean.setOrder(2);
		return registrationBean;
	} **/
}

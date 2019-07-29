package com.myapp.config;

import javax.servlet.ServletRegistration.Dynamic;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;
/*基础的Servlet注册初始化器类*/
public class MyServletInitalizer implements WebApplicationInitializer{
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		Dynamic myServlet = servletContext.addServlet("myServlet", MyServlet.class);	//注册servlet
		myServlet.addMapping("/custom/**");	//映射Servlet
		
		javax.servlet.FilterRegistration.Dynamic filter = servletContext.addFilter("myFilter", MyFilter.class);                                                                                                                    
		filter.addMappingForUrlPatterns(null, false, "/custom/**");
	}
	
}
/*
 * 在支持Servlet 3.0的容器中，那么WebApplicationInitializer提供了一种通用的方式，实现在Java中注册Servlet、Filter和Listener。
 */

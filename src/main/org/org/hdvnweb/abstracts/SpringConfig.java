package org.hdvnweb.abstracts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class SpringConfig {
	
	protected Class<?> initLoadingSpringContext(String bean) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Class<?> object = (Class<?>) context.getBean(bean);
		
		return object;
	}
}

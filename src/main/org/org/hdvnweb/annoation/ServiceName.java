package org.hdvnweb.annoation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,  ElementType.TYPE})
public @interface ServiceName {

	String beanName() default "";
	
	Class<?> className() default Object.class;
}

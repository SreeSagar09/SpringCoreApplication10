package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.Products;
import com.app.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Products products = applicationContext.getBean(Products.class);
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		System.out.println("---------BeanDefinitionNames---------");
		for (String beanName : beanDefinitionNames) {
			System.out.println(beanName);
		}
		System.out.println("---------Products Bean---------");
		System.out.println(products);
	}
}

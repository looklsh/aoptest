package com.bitacademy.aoptest;

import org.aspectj.lang.annotation.AfterReturning;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// ApplicationContext로부터 productService Bean을 가져오기
		ApplicationContext ac = new ClassPathXmlApplicationContext("config/applicationContext.xml");
		ProductService ps = ac.getBean(ProductService.class);
		
		ProductVo vo = ps.findProduct("Galaxy S10");
		System.out.println("상품을 찾았습니다:" + vo);
	}
	
	

}

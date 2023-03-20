package io.github.Victor5H;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.github.Victor5H.services.ProductService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("io/github/Victor5H/config.xml");
		// ApplicationContext context = new
		// AnnotationConfigApplicationContext(io.github.Victor5H.config.class);
		ProductService productService = context.getBean("productService", ProductService.class);
		productService.multiply(8, 5);

	}
}

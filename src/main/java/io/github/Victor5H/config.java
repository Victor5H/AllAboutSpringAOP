package io.github.Victor5H;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import io.github.Victor5H.services.ProductService;
import io.github.Victor5H.services.ProductServiceImpl;

@Configuration
@ComponentScan("io.github.Victor5H") // dont need to create bean for Aspect class
public class config {
	@Bean("productService")
	public ProductService getProductService() {
		return new ProductServiceImpl();
	}

//	@Bean
//	public LoggingAspect getloggingAspect() {
//		return new LoggingAspect();
//	}
}

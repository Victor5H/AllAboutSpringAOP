package io.github.Victor5H.services;

import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {
	public ProductServiceImpl() {

	}

	public int multiply(int n1, int n2) throws NumberFormatException {
		System.out.println("multiply");
		if (n1 == 0 || n2 == 0)
			throw new NumberFormatException();
		return n1 * n2;
	}

}

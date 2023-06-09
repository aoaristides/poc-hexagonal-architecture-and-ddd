package br.com.makersweb.application.ports.in;

import br.com.makersweb.domain.entity.Product;

/**
 * @author aaristides
 */
public interface CreateProductUseCase {

    Product createProduct(Product product);

}

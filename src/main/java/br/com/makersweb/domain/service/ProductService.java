package br.com.makersweb.domain.service;

import br.com.makersweb.application.ports.in.CreateProductUseCase;
import br.com.makersweb.application.ports.in.GetProductUseCase;
import br.com.makersweb.application.ports.out.ProductOutputPort;
import br.com.makersweb.domain.entity.Product;
import br.com.makersweb.domain.exception.ProductNotFoundException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

/**
 * @author aaristides
 */
@Slf4j
@AllArgsConstructor
public class ProductService implements CreateProductUseCase, GetProductUseCase {

    private final ProductOutputPort productOutputPort;

    @Override
    public Product createProduct(Product product) {
        log.info("Init method createProduct by - {}", product.getId());
        return productOutputPort.saveProduct(product);
    }

    @Override
    public Product getProductById(UUID id) {
        log.info("Init method getProductById by id - {}", id.toString());
        return productOutputPort.getProductById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product not found by Id: " + id));
    }
}

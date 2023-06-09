package br.com.makersweb.application.ports.out;

import br.com.makersweb.domain.entity.Product;

import java.util.Optional;
import java.util.UUID;

/**
 * @author aaristides
 */
public interface ProductOutputPort {

    Product saveProduct(Product product);

    Optional<Product> getProductById(UUID id);

}

package br.com.makersweb.application.ports.in;

import br.com.makersweb.domain.entity.Product;

import java.util.UUID;

/**
 * @author aaristides
 */
public interface GetProductUseCase {

    Product getProductById(UUID id);

}

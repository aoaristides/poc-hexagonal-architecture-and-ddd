package br.com.makersweb.infrastructure.adapters.out;

import br.com.makersweb.application.ports.out.ProductOutputPort;
import br.com.makersweb.domain.entity.Product;
import br.com.makersweb.infrastructure.adapters.out.entity.ProductEntity;
import br.com.makersweb.infrastructure.adapters.out.mapper.ProductMapper;
import br.com.makersweb.infrastructure.adapters.out.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Optional;
import java.util.UUID;

/**
 * @author aaristides
 */
@Slf4j
@RequiredArgsConstructor
public class ProductPersistenceAdapter implements ProductOutputPort {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @Override
    public Product saveProduct(Product product) {
        log.info("Init method saveProduct to product - {}", product.getName());
        var productEntity = productMapper.toEntity(product);
        productRepository.save(productEntity);
        return productMapper.toProduct(productEntity);
    }

    @Override
    public Optional<Product> getProductById(UUID id) {
        log.info("Init method getProductById by id - {}", id);
        Optional<ProductEntity> productEntity = productRepository.findById(id);

        if(productEntity.isEmpty()) {
            return Optional.empty();
        }

        Product product = productMapper.toProduct(productEntity.get());
        return Optional.of(product);
    }
}

package br.com.makersweb.infrastructure.adapters.configuration;

import br.com.makersweb.domain.service.ProductService;
import br.com.makersweb.infrastructure.adapters.out.ProductPersistenceAdapter;
import br.com.makersweb.infrastructure.adapters.out.mapper.ProductMapper;
import br.com.makersweb.infrastructure.adapters.out.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author aaristides
 */
@Configuration
public class BeanConfiguration {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

    @Bean
    public ProductMapper productMapper(){
        return new ProductMapper(modelMapper());
    }

    @Bean
    public ProductPersistenceAdapter productPersistenceAdapter(ProductRepository productRepository, ProductMapper productMapper) {
        return new ProductPersistenceAdapter(productRepository, productMapper);
    }

    @Bean
    public ProductService productService(ProductPersistenceAdapter productPersistenceAdapter) {
        return new ProductService(productPersistenceAdapter);
    }

}

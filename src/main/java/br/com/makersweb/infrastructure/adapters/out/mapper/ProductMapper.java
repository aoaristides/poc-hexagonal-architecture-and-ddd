package br.com.makersweb.infrastructure.adapters.out.mapper;

import br.com.makersweb.domain.entity.Product;
import br.com.makersweb.infrastructure.adapters.out.entity.ProductEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author aaristides
 */
public class ProductMapper {

    private ModelMapper mapper;

    public ProductMapper(@Autowired ModelMapper mapper) {
        this.mapper = mapper;
    }

    public Product toProduct(ProductEntity entity){
        return mapper.map(entity, Product.class);
    }

    public ProductEntity toEntity(Product product){
        return mapper.map(product, ProductEntity.class);
    }

}

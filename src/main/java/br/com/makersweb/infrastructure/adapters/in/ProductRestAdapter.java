package br.com.makersweb.infrastructure.adapters.in;

import br.com.makersweb.application.ports.in.CreateProductUseCase;
import br.com.makersweb.application.ports.in.GetProductUseCase;
import br.com.makersweb.domain.entity.Product;
import br.com.makersweb.infrastructure.adapters.in.dto.request.ProductRequest;
import br.com.makersweb.infrastructure.adapters.in.dto.response.ProductResponse;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * @author aaristides
 */
@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductRestAdapter {

    private final CreateProductUseCase createProductUseCase;
    private final GetProductUseCase getProductUseCase;
    private final ModelMapper mapper;

    @PostMapping
    public ResponseEntity<ProductResponse> createProduct(@RequestBody ProductRequest request) {
        var product = mapper.map(request, Product.class);
        product = createProductUseCase.createProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(mapper.map(product, ProductResponse.class));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductResponse> getProduct(@PathVariable UUID id) {
        var product = getProductUseCase.getProductById(id);
        return ResponseEntity.ok(mapper.map(product, ProductResponse.class));
    }

}

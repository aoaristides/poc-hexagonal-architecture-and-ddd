package br.com.makersweb.infrastructure.adapters.out.repository;

import br.com.makersweb.infrastructure.adapters.out.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * @author aaristides
 */
public interface ProductRepository extends JpaRepository<ProductEntity, UUID> {
}

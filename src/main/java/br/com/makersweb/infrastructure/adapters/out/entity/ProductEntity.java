package br.com.makersweb.infrastructure.adapters.out.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

/**
 * @author aaristides
 */
@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private String description;

}

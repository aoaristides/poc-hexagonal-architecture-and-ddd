package br.com.makersweb.domain.entity;

import lombok.*;

import java.util.UUID;

/**
 * @author aaristides
 */
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private UUID id;
    private String name;
    private String description;

}

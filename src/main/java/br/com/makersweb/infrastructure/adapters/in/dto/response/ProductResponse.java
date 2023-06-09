package br.com.makersweb.infrastructure.adapters.in.dto.response;

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
public class ProductResponse {

    private UUID id;
    private String name;
    private String description;

}

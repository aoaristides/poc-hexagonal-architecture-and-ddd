package br.com.makersweb.infrastructure.adapters.in.dto.request;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;

/**
 * @author aaristides
 */
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {

    @NotEmpty(message = "Name may not be empty")
    private String name;

    @NotEmpty(message = "Description may not be empty")
    private String description;

}

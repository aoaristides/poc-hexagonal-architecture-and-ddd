package br.com.makersweb.domain.exception;

/**
 * @author aaristides
 */
public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException(String message) {
        super(message);
    }

}

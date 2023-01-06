package az.burhan.user.management.app.exception;

import static java.lang.String.format;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String resourceName, String fieldName, Object param) {
        super(format("%s was not found by %s : %s in db"));
    }
}

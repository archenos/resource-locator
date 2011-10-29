package org.archenos.locator;

public final class ResourceNotFoundException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException() {
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }

    public ResourceNotFoundException(Throwable cause) {
        super(cause);
    }

    public ResourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}

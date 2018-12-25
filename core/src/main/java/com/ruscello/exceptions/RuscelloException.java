package com.ruscello.exceptions;

/**
 * The base class of all Ruscello exceptions
 */
public class RuscelloException extends RuntimeException {

    private final static long serialVersionUID = 1L;

    /**
     *
     * @param message
     * @param cause
     */
    public RuscelloException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     *
     * @param message
     */
    public RuscelloException(String message) {
        super(message);
    }

    /**
     *
     * @param cause
     */
    public RuscelloException(Throwable cause) {
        super(cause);
    }

    /**
     *
     */
    public RuscelloException() {
        super();
    }

}
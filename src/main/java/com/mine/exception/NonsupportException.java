package com.mine.exception;

/**
 * @author xl-9527
 * @since 2024/10/19
 **/
public class NonsupportException extends RuntimeException {

    public NonsupportException(final String message) {
        super(message);
    }

    public NonsupportException(final String message, final Throwable cause) {
        super(message, cause);
    }
}

package com.fantastic.zbatis.exceptions;

/**
 * @author zc
 * @Description
 * @create 2021-06-30 10:55
 */
public class PersistenceException extends RuntimeException {

    private static final long serialVersionUID = -7537395265357977271L;

    public PersistenceException() {
        super();
    }

    public PersistenceException(String message) {
        super(message);
    }

    public PersistenceException(String message, Throwable cause) {
        super(message, cause);
    }

    public PersistenceException(Throwable cause) {
        super(cause);
    }
}


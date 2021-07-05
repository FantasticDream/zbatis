package com.fantastic.zbatis.builder;

import com.fantastic.zbatis.exceptions.PersistenceException;

/**
 * @author zc
 * @Description
 * @create 2021-07-05 16:35
 */
public class BuilderException extends PersistenceException {

    private static final long serialVersionUID = -3885164021020443281L;

    public BuilderException() {
        super();
    }

    public BuilderException(String message) {
        super(message);
    }

    public BuilderException(String message, Throwable cause) {
        super(message, cause);
    }

    public BuilderException(Throwable cause) {
        super(cause);
    }
}

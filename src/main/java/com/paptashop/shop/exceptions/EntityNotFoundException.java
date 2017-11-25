package com.paptashop.shop.exceptions;

public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException() {
        super();
    }

    public EntityNotFoundException(String s) {
        super(s);
    }

    public EntityNotFoundException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public EntityNotFoundException(Throwable throwable) {
        super(throwable);
    }

    protected EntityNotFoundException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}

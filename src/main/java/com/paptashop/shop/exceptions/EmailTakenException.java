package com.paptashop.shop.exceptions;

public class EmailTakenException extends RuntimeException {
    public EmailTakenException() {
        super();
    }

    public EmailTakenException(String s) {
        super(s);
    }

    public EmailTakenException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public EmailTakenException(Throwable throwable) {
        super(throwable);
    }

    protected EmailTakenException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}

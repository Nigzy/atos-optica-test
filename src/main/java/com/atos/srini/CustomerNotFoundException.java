package com.atos.srini;

public class CustomerNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 7784812509339490442L;

    public CustomerNotFoundException(String exception) {
        super(exception);
    }

}
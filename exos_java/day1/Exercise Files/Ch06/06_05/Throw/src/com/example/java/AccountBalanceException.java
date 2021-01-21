package com.example.java;

public class AccountBalanceException extends Exception {
    @Override
    public String getMessage() {
        return "La balance de votre compte bancaire ne peut être inférieur à zero";
    }
}

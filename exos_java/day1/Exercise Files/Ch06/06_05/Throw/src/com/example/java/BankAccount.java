package com.example.java;

public class BankAccount {
    public int balance = 0;

    public void alimenterMonCompte(int montant) {
        this.balance += montant;
    }

    public void faireUnRetrait(int montant) throws AccountBalanceException {
        this.balance -= montant;
        if(this.balance < 0) {
            this.balance += montant;
            throw new AccountBalanceException();
        }
    }


}

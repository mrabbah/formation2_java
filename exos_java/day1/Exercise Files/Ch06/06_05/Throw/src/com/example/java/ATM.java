package com.example.java;

public class ATM {
    public void faireUnRetrait(BankAccount ba , int montant) {
        try {
            ba.faireUnRetrait(montant);
        } catch (AccountBalanceException e) {
            System.out.println(e.getMessage());
            System.out.println("Votre solde actuel " + ba.balance);
        }
    }
}



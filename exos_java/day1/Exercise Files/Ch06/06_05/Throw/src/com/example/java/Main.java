package com.example.java;

public class Main {

    public static void main(String[] args) {

        BankAccount b = new BankAccount();
        b.alimenterMonCompte(100);
        ATM atm = new ATM();
        atm.faireUnRetrait(b, 40);
        atm.faireUnRetrait(b,90);

/*        try {
            b.faireUnRetrait(30);
            b.faireUnRetrait(80);
        } catch (AccountBalanceException e) {
            System.out.println(e.getMessage());
            System.out.printf("Votre solde actuel est " + b.balance);
        }
*/


        /* String welcome = "Welcome!";
        char[] chars = welcome.toCharArray();

        try {
            char lastChar = chars[chars.length - 1];
            System.out.println(lastChar);

            if(chars.length < 10) {
                throw (new Exception("My cutom message from my exception"));
            }
            String sub = welcome.substring(10);
            System.out.println("Substring: " + sub);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index problem!");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String index problem!");
        }  catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fin de l'application");*/
    }

}

package com.example.java;

public class Main {

    public static void main(String[] args) {

        String welcome = "Welcome!";
        char[] chars = welcome.toCharArray();

       try {
            char lastChar = chars[chars.length - 1];
            System.out.println("Last character: " + lastChar);
            float f = 15 / 0;

        } catch (ArrayIndexOutOfBoundsException aioobe) {
           System.out.println("Vous avez dépasser la longeur du tableau");
        } catch (ArithmeticException ae) {
           System.out.println("Division par zero non permise");
        } catch (Exception e) {
           System.out.println(e.getMessage());
       }

        System.out.println("Fin de mon application");

    }

}

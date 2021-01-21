package com.example.java;

public class Main {



	public static void main(String[] args) {

		Object o;

		String s1 = "une chaine de caractère";
		System.out.println(s1);

		String s2 = " ma deuxième chaine";

		String s3 = s1 + s2 + " !";

		System.out.println(s3);

		char[] chars = {'H', 'e' , 'l', 'l', 'o'};
		String s4 = new String(chars);
		System.out.println(s4);

		char[] char2 = s4.toCharArray();
		for (char c : char2) {
			System.out.println(c);
		}

		String machaine1 = "Hello";
		String machaine2 = "Hello";

		System.out.println(machaine1.equals(machaine2));
	}

}

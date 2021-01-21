package com.example.java;

import com.example.java.model.Olive;

import java.util.List;

/**
 * Classe qui permet de presser les olives
 */
public class OlivePress {

	/**
	 * méthode qui persse les olives
	 * @param olives - une liste d'olives
	 * @return - la quantitié d'olivre extraite en litre
	 */
	public int getOil(List<Olive> olives) {

		int totalOil = 0;
		for (Olive o : olives) {
			totalOil += o.crush();
		}

		return totalOil;

	}

}

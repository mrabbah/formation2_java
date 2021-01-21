package com.example.java;

import com.example.java.model.Olive;

import java.util.List;

public class OlivePress implements Press {

	private int currentOil;

	@Override
	public int getOil(List<Olive> olives) {

		int totalOil = this.currentOil;
		for (Olive o : olives) {
			totalOil += o.crush();
		}

		return totalOil;

	}

	@Override
	public void setOil(int oil) {
		this.currentOil = oil;
	}

	public void callMe() {

	}


	@Override
	public void passerEnModeMaintenance() {

	}
}

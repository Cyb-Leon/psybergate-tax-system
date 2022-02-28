package com.psybergate.taxcalculator.taxtable;

public interface ITaxTable {

	public double getTaxPayable();
	
	public void calculateTaxPayable(double taxableIncome );
}

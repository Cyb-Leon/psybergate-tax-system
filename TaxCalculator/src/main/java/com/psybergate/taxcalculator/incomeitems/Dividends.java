package com.psybergate.taxcalculator.incomeitems;

import com.psybergate.taxcalculator.TaxItem;

public class Dividends extends TaxItem {
	
	public Dividends(double income,boolean taxDeductable) {
		super(income,taxDeductable);
		// TODO Auto-generated constructor stub
		setName("Dividends");
	}
	
@Override
public double calculateTax(double income )  {	
	return 0;	
	}


}

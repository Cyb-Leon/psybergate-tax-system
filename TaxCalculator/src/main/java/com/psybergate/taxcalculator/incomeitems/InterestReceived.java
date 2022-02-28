package com.psybergate.taxcalculator.incomeitems;

import com.psybergate.taxcalculator.TaxItem;

public class InterestReceived extends TaxItem {
	
	public InterestReceived(double income, double exemptionAmount,boolean taxDeductable) {
		super(income,exemptionAmount,taxDeductable);
		// TODO Auto-generated constructor stub

		setName("Interest Received");
	}
	
	@Override
	public double calculateTax(double income) {
	
		return  income - getExemptionAmount();
	
		
	}


}

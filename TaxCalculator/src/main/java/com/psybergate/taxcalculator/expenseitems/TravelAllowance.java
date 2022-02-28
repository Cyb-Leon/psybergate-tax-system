package com.psybergate.taxcalculator.expenseitems;

import com.psybergate.taxcalculator.TaxItem;

public class TravelAllowance extends TaxItem {

	public TravelAllowance(double income,double exemptionAmount,boolean taxDeductable) {
		super(income,exemptionAmount,taxDeductable);
		// TODO Auto-generated constructor stub	
		setName("Travel Allowance");
	}
	

}

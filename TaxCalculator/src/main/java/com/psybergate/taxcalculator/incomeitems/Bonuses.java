package com.psybergate.taxcalculator.incomeitems;

import com.psybergate.taxcalculator.TaxItem;

public class Bonuses extends TaxItem {
	
	
	public Bonuses(double income ,boolean taxDeductable) 
	{super(income,taxDeductable);
	 setName("Bonuses");
	}

}

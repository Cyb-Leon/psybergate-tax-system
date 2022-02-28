package com.psybergate.taxcalculator.incomeitems;

import com.psybergate.taxcalculator.TaxItem;

public class Salary extends TaxItem
{
public Salary(double income,boolean taxDeductable) {
	super(income,taxDeductable);
	// TODO Auto-generated constructor stub
	setName("Salary");
}

}

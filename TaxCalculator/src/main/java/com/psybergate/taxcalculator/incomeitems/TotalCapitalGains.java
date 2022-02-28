package com.psybergate.taxcalculator.incomeitems;

import com.psybergate.taxcalculator.TaxItem;

public class TotalCapitalGains extends TaxItem{

	
	public TotalCapitalGains(double income ,double exemptionAmount ,double inclutionRate,boolean taxDeductable) 
	{super(income,exemptionAmount,inclutionRate,taxDeductable);
	
		setName("Total Capital Gains");
		// TODO Auto-generated constructor stub
	}
	@Override
	public double calculateTax(double income)  {		
		return (income-getExemptionAmount()) *(getInclutionRate()/100);
		}

}

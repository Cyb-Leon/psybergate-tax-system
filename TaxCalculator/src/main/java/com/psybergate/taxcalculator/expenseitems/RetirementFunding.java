package com.psybergate.taxcalculator.expenseitems;

import com.psybergate.taxcalculator.TaxItem;

public class RetirementFunding extends TaxItem{
	
//	private double exemptionAmount1;
//	private double maxExemptionAmount;
	public RetirementFunding(double income , double inclutionRate,boolean taxDeductable,double maxExemptionAmount, double salary) 
	{super(income, maxExemptionAmount = (maxExemptionAmount <=  (salary *(inclutionRate/100)))? maxExemptionAmount:(salary *(inclutionRate/100)),inclutionRate,taxDeductable);
		// TODO Auto-generated constructor stub
//		this.maxExemptionAmount = maxExemptionAmount;	
//		this.exemptionAmount1 = salary *(inclutionRate/100);
//		if (exemptionAmount1 >= this.maxExemptionAmount) {
//			System.out.println( "currentExemptionAmount :"+this.maxExemptionAmount);
//			setExemptionAmount(this.maxExemptionAmount);
//			System.out.println( "currentExemptionAmount--2 : "+getExemptionAmount());
//		}else {
//			System.out.println( "currentExemptionAmount :"+this.exemptionAmount1);
//			setExemptionAmount(exemptionAmount1);
//			System.out.println( "currentExemptionAmount--2 : "+getExemptionAmount());
//		}
		setName("Retirement Funding");
	}
//	@Override
//	public double calculateTax(double income )  {
//		double currentExemptionAmount =0 ;
//		System.out.println( "using :"+getExemptionAmount());
//		System.out.println( "using2 :"+income);
//		if (income <=  getExemptionAmount()) {
//			return income;
//		}return currentExemptionAmount;
//		
//		
//		
//	
//	
//	}


}

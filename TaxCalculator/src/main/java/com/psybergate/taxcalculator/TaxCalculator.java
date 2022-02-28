
package com.psybergate.taxcalculator;
//import java.math.BigDecimal; 

import com.psybergate.taxcalculator.expenseitems.*;
import com.psybergate.taxcalculator.incomeitems.*;
import com.psybergate.taxcalculator.taxtable.*;


public abstract class TaxCalculator {
	private static double medicalCredits =10000;
	private  static double primaryRebate = 14220;
	private static double nettTaxPayable ;
	public static void main(String[] args) {
		
	
		TaxItem salary = new Salary(500000,false);
		TaxItem bonuses = new Bonuses(25000,false);
		TaxItem interestReceived = new InterestReceived(31246,23500,false);
		TaxItem dividends = new Dividends(15000,false);
		TaxItem totalCapitalGain = new TotalCapitalGains(800_000,40000,40,false);					
		TaxItem retirementFunding = new RetirementFunding(135_000,27.5,true,350_000,salary.getIncome());
		TaxItem travelAllowance = new TravelAllowance(50_000,80_000,true);
		
		
		ITaxTable taxTable = new TaxTable();
	    taxTable.calculateTaxPayable(TaxItem.getTotalTaxableIncome());
	    
		nettTaxPayable = taxTable.getTaxPayable();
		nettTaxPayable -= medicalCredits;
		nettTaxPayable -= primaryRebate;
	    
	    //output
		System.out.println("-------------------------------------------------");
		System.out.println(salary.getName()+": "+salary.getTaxableIncome());
		System.out.println(bonuses.getName()+": "+ bonuses.getTaxableIncome());
		System.out.println(interestReceived.getName()+": "+ interestReceived.getTaxableIncome());
		System.out.println(dividends.getName()+": "+ dividends.getTaxableIncome());
		System.out.println(totalCapitalGain.getName()+": "+ totalCapitalGain.getTaxableIncome());	
		System.out.println(retirementFunding.getName()+": "+ retirementFunding.getTaxableIncome());
		System.out.println(travelAllowance.getName()+": "+ travelAllowance.getTaxableIncome());
		System.out.println("Total " + TaxItem.getTotalTaxableIncome());	
		System.out.println("Payable tax: " +taxTable.getTaxPayable());	
		System.out.println("Nett tax payable: " +nettTaxPayable);
		
		

	}
	
	
	
	


}

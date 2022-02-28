package com.psybergate.taxcalculator.taxtable;



public class TaxTable implements ITaxTable{
private BracketData[] bracketData;
private double totalTaxPayble; 
	
	public TaxTable() {
		bracketData = new BracketData[7];
		
		bracketData[0] = new BracketData(0,18);
		bracketData[1] = new BracketData(205_901,26);
		bracketData[2] = new BracketData(321_601,31);
		bracketData[3] = new BracketData(445_101,36);
		bracketData[4] = new BracketData(584_201,39);
		bracketData[5] = new BracketData(744_801,41);
		bracketData[6] = new BracketData(1_557_301,45);
		
		createTaxTable(bracketData,true);		
		// TODO Auto-generated constructor stub
		// Default tax year 2020/2021
		
		
		
	}
	public TaxTable(BracketData[] bracketData) {
		
	createTaxTable(bracketData,true);
		// TODO Auto-generated constructor stub
	}
	
	
	private void createTaxTable(BracketData[] bracketData,boolean lowValues) {
		this.bracketData = new BracketData[bracketData.length] ;
		
		if (lowValues) {
			this.bracketData[bracketData.length-1] = new BracketData(bracketData[bracketData.length-1].lowbracketValue,-1,bracketData[bracketData.length-1].percentage);
			for (int i = bracketData.length-2; i > 0; i--) {		
				this.bracketData[i] = new BracketData(bracketData[i].lowbracketValue, this.bracketData[i+1].lowbracketValue-1, bracketData[i].percentage);
			}
			this.bracketData[0] = new BracketData(bracketData[0].lowbracketValue,this.bracketData[1].lowbracketValue-1,bracketData[0].percentage) ;
		
		}else 
		{
			
		}
		
		
		
		
	}
	
	public double getTaxPayable() {
	   
	return  totalTaxPayble;
	}
	@Override
	public void calculateTaxPayable(double taxableIncome) {
		double taxPayable =0;
		double remainder=0;
		
		for (BracketData currentBracket : bracketData) {
		
			if (taxableIncome >= currentBracket.highbracketValue ) {
				taxPayable += (currentBracket.highbracketValue-currentBracket.lowbracketValue) *(currentBracket.percentage/100);
				
				
				remainder = taxableIncome -currentBracket.highbracketValue ;;
				
				
			}else {
				taxPayable += remainder *(currentBracket.percentage/100);
				
				break;
			}
			
			
			 System.out.println("-----------------------");
			 System.out.println("Tax bracket");
			System.out.println("taxableIncome - "+taxableIncome);
			System.out.println("bracket High - "+currentBracket.highbracketValue);
			System.out.println("bracket low - "+currentBracket.lowbracketValue);
			System.out.println("bracket Div - "+(currentBracket.highbracketValue - currentBracket.lowbracketValue));
			System.out.println("Remainder - "+remainder);
			System.out.println("taxPayable - "+taxPayable);
			 System.out.println("-----------------------");
		

			
		}
		totalTaxPayble = taxPayable;
		
	}

}

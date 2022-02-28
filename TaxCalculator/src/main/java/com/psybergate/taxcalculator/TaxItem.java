package com.psybergate.taxcalculator;

public abstract class TaxItem {
      private static  double totalTaxableIncome;
	  private double  inclutionRate ;
	  private double income;
	  private double taxableIncome;
		private double exemptionAmount;
		private String name;
		

		
        //--------------Constructors-----------------
		public TaxItem(double income,boolean taxDeductable ) {
			// TODO Auto-generated constructor stub
			this.income = income;
			 this.taxableIncome = calculateTax(income);
			 updateTotalTaxableIncome( this.taxableIncome,taxDeductable);
		}
		
		public TaxItem(double income, double excemptionAmount, boolean taxDeductable ) {
			// TODO Auto-generated constructor stub
			this.income = income;
			this.exemptionAmount = excemptionAmount;
			 this.taxableIncome = calculateTax(income);;
			 updateTotalTaxableIncome( this.taxableIncome,taxDeductable);
		}
		public TaxItem(double income, double excemptionAmount , double inclutionRate ,boolean taxDeductable ) {
			// TODO Auto-generated constructor stub
			this.income = income;
			this.exemptionAmount = excemptionAmount;
			this.inclutionRate = inclutionRate;
			 this.taxableIncome = calculateTax(income);
			 updateTotalTaxableIncome( this.taxableIncome,taxDeductable);
		}
		//------------------------------------------------
		
		public double getTaxableIncome() {
			return taxableIncome;
		}
		
		protected double getIncome() {
			return income;
		}
		
		protected void setTaxableIncome(double taxableIncome) {
			this.taxableIncome = taxableIncome;
		}
		
		protected void setIncome(double income) {
			this.income = income;
		}
		
	
	    protected void setName(String name) {
	    	this.name = name;
	    }
	    
	    public  String getName() {
	    	return name;
	    }
		
		public static double getTotalTaxableIncome() {
			return totalTaxableIncome;
		}
		
		protected static void addTaxableIncome(double amount) {
			totalTaxableIncome += amount;
		}
		protected static void subtractTaxableIncome(double amount) {
			totalTaxableIncome -= amount;
		}
		
		public double getInclutionRate() {
			return inclutionRate;
		}
		
		public void setinclutionRate(double inclutionRate) {
			this.inclutionRate =inclutionRate;
		}
		public  double getExemptionAmount() {
			return exemptionAmount;
		}
		public void setExemptionAmount(double exemptionAmount ) {
			this.exemptionAmount = exemptionAmount;
		}
		private void updateTotalTaxableIncome(double income , boolean taxDeductable) {
			if (taxDeductable) {
				subtractTaxableIncome(income);
			}else {
				addTaxableIncome(income);
			}
		}
		
		
		
		protected double calculateTax(double income)
		{			
				if (income <= getExemptionAmount() ||  getExemptionAmount() == 0) {
					return  income;					
				}
					return getExemptionAmount();				
				
							
		}
		


}

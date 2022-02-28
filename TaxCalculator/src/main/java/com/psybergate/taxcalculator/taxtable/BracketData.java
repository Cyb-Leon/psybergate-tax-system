package com.psybergate.taxcalculator.taxtable;

public class BracketData {

	double highbracketValue ;
	double lowbracketValue;
	double percentage;

	
	
	public BracketData(double lowValue, double percentage) {
		// TODO Auto-generated constructor stub
	
		this.lowbracketValue = lowValue;
		this.percentage = percentage;
	
		
	}
	public BracketData(double lowValue,double highValue, double percentage) {
		// TODO Auto-generated constructor stub
		this.highbracketValue = highValue;
		this.percentage = percentage;
		this.lowbracketValue = lowValue;
	}
	
}

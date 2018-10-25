package com.socgen.calculator;

public enum Operator {

	ADD {
	    public double operation(double a, double b) { 
	    	return a + b; }
	}, 
	SUBTRACT {
	    public double operation(double a, double b) { 
	    	return a - b; }
	}, 
	MULTIPLY {
	    public double operation(double a, double b) { 
	    	return a * b; }
	}, 
	DIVIDE {
		public double operation(double a, double b) {
			return a / b;
		}
	},
	MODULO {
		public double operation(double a, double b) {
			return a % b;
		}
	}
	;
	
	public abstract double operation(double a, double b);
	
}

package com.calculator.services;

public class CalculatorWebServiceImpl {
	
	 private double result = 0;
	
	public double addition(double first_parameter,double second_parameter){
	   
		result = first_parameter + second_parameter;
	    return result;      
		
	}
	public double division(double first_parameter,double second_parameter){
		
		   result = first_parameter / second_parameter;
		   return result;
	}
	public double multiplication(double first_parameter,double second_parameter) {
		
		   result = first_parameter * second_parameter;
		   return  result;
	
	}
	public double subtraction(double first_parameter,double second_parameter){
		
		   result = first_parameter - second_parameter;
		   return  result;
		
	}
	
}

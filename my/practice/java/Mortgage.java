package practice.java.impl;


import java.util.Scanner;

import practice.java.util.AmountException;
import practice.java.util.AnnulaInterestRateException;

public class Mortgage extends Thread {
		
	public static Scanner input;
	public static int MonthsInAYear = 12;
	public static int Percent = 100;

	public static void main(String[] args) throws AnnulaInterestRateException,AmountException {
		input = new Scanner(System.in);
		System.out.print("Amount for Mortgage : ");
		int Amount = input.nextInt();
		if(Amount ==0) {
			throw new AmountException(" Enter a valied Amount.");
		}
		
		
		System.out.print("Annual Interest Rate for Mortgage : ");
		float annualInterest = input.nextFloat(); 
		if(annualInterest == 0) {
			AnnulaInterestRateException exceptionObj =  new AnnulaInterestRateException("Annual Interest cannot be zero.");
			System.out.println("exceptionObj:"+exceptionObj);
			
			AnnulaInterestRateException exceptionObj1 =  new AnnulaInterestRateException("Annual2 Interest cannot be zero.");
			System.out.println("exceptionObj1:"+exceptionObj1);
			throw exceptionObj;
		}
		
	
	    float monthlyInterest = annualInterest/MonthsInAYear/Percent;
		System.out.println("Monthly Interest is : "+monthlyInterest);
	    
		
	    System.out.print("Period in years for repayment : ");
	    int years = input.nextInt()*MonthsInAYear;
	    System.out.println("Number of payments : "+years);
	    
	    
	    System.out.print("Mortgage amount is : ");
	    float amountPayable = (float) (Amount * (monthlyInterest*Math.pow(monthlyInterest + 1, years))/(Math.pow(monthlyInterest + 1, years)-1));
	    System.out.print("$"+amountPayable);
	    
	}

}

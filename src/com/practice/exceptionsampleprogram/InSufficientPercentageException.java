package com.practice.exceptionsampleprogram;

public class InSufficientPercentageException extends Exception 
{
	double percentage;
	InSufficientPercentageException(double per)
	{
		percentage = per; 
	}
}

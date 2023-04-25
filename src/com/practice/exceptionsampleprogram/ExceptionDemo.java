package com.practice.exceptionsampleprogram;


            /*  Note: Exception Handling
              1.RunTime Exception
              * ArtithmeticException
              * NullPointerException)*/
import java.io.*;             
public class ExceptionDemo
{
public static void main(String[] args)
{
int a= 50,b=0;
int c = 1 ;
try
{
	                           //NullPointerException
//int arr[] = null;
//System.out.println(arr[5]);
c= a/b;
}

catch(ArithmeticException  e)
{
System.out.println("Arithmetic Exception has Error Occured");
}
catch(NullPointerException e)
{
	System.out.println("NullPointer Exception has Occured ");
}
finally
{
	System.out.println("This gets Printed");
}
   /*Note : Exception Handling
            1.CompileTime Exception
            * FileHandling Exception*/

//step1 . import java.io.*;

/*File file = new File("ConnectionUtil.txt");
try 
{
	FileInputStream f = new FileInputStream(file);
} catch (FileNotFoundException e)
 {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
// or I can use throws Exception in main
System.out.println(c);
System.out.println("NullPOinter Exception Successfully Caughted");*/


//UserDefined Exception:

try
{

double obtainedpercentage = 60, studentpercentage = 70;
 if (obtainedpercentage<studentpercentage)
 throw new InSufficientPercentageException(studentpercentage-obtainedpercentage);
}
catch(InSufficientPercentageException e)
{
	System.out.println("Student are able to allow the Examination");
}
}
}
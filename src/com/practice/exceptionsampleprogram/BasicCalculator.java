package com.practice.exceptionsampleprogram;

import java.util.Scanner;

class InvalidOperatorException extends Exception
{
    public InvalidOperatorException(String s)
    {
       super(s);
    }
}
class Operator 
{
char operator;
    
Double number1, number2, result;
Double operator(String operator,Double number1,Double number2) throws InvalidOperatorException  
{
if(operator.equals("+")||operator.equals("-")||operator.equals("/")||operator.equals("*")) 
{
if(operator.equals("+")) 
{
result = number1 + number2;
return (result);
}
else if(operator.equals("-")) 
{
result = number1 - number2;
return (result);
}
else if(operator.equals("*")) 
{
result = number1 * number2;
return (result);
}
else  
{
result = number1 / number2;
return (result);
}
}
else 
{
throw new InvalidOperatorException("invalid operator");
}
}
}
public class BasicCalculator 
{
public static void main(String[] args) throws InvalidOperatorException
{
String operator;
Double number1, number2, result;
Scanner sc = new Scanner(System.in);
System.out.println("Choose an operator: +, -, *, or /");
operator = sc.nextLine();
System.out.println("Enter Number 1:");
number1 = sc.nextDouble();
System.out.println("Enter Number 2:");
number2 = sc.nextDouble();
Operator ob=new Operator();
result =ob.operator(operator,number1,number2);
try
{
System.out.println(number1 + operator + number2 + " = " +result );
}
catch(Exception e) 
{
System.out.println(e);
    }
  }
}
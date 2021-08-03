package ua.lviv.logos;

import java.util.Scanner;

public class Methods {
	
	public static double sum(double a, double b) throws IllegalArgumentException, MyException, IllegalAccessException
	{
       double retval = 0;
	   if (a < 0 && b < 0)
       {
    	   throw new IllegalArgumentException("a < 0 && b < 0");
       }
	   else if ((a == 0 && b != 0) || (a != 0 && b == 0))
		{
		   throw new ArithmeticException("(a == 0 && b != 0) || (a != 0 && b == 0)");
		}
	   else if (a == 0 && b == 0)
	   {
		   throw new IllegalAccessException("a == 0 && b == 0");
	   }
	   else if (a > 0 && b > 0)
	   {
		   throw new MyException("a > 0 && b > 0");
	   }
       else
       {
    	   retval = a + b; 
       }
       return retval;
	}
	
	public static double minus(double a, double b) throws IllegalArgumentException, MyException, IllegalAccessException
	{
       double retval = 0;
	   if (a < 0 && b < 0)
       {
    	   throw new IllegalArgumentException("a < 0 && b < 0");
       }
	   else if ((a == 0 && b != 0) || (a != 0 && b == 0))
		{
		   throw new ArithmeticException("(a == 0 && b != 0) || (a != 0 && b == 0)");
		}
	   else if (a == 0 && b == 0)
	   {
		   throw new IllegalAccessException("a == 0 && b == 0");
	   }
	   else if (a > 0 && b > 0)
	   {
		   throw new MyException("a > 0 && b > 0");
	   }
       else
       {
    	   retval = a - b; 
       }
       return retval;
	}
	
	public static double division(double a, double b) throws IllegalArgumentException, MyException, IllegalAccessException
	{
       double retval = 0;
	   if (a < 0 && b < 0)
       {
    	   throw new IllegalArgumentException("a < 0 && b < 0");
       }
	   else if ((a == 0 && b != 0) || (a != 0 && b == 0))
		{
		   throw new ArithmeticException("(a == 0 && b != 0) || (a != 0 && b == 0)");
		}
	   else if (a == 0 && b == 0)
	   {
		   throw new IllegalAccessException("a == 0 && b == 0");
	   }
	   else if (a > 0 && b > 0)
	   {
		   throw new MyException("a > 0 && b > 0");
	   }
       else
       {
    	   retval = a / b; 
       }
       return retval;
	}
	
	public static double multi(double a, double b) throws IllegalArgumentException, MyException, IllegalAccessException
	{
       double retval = 0;
	   if (a < 0 && b < 0)
       {
    	   throw new IllegalArgumentException("a < 0 && b < 0");
       }
	   else if ((a == 0 && b != 0) || (a != 0 && b == 0))
		{
		   throw new ArithmeticException("(a == 0 && b != 0) || (a != 0 && b == 0)");
		}
	   else if (a == 0 && b == 0)
	   {
		   throw new IllegalAccessException("a == 0 && b == 0");
	   }
	   else if (a > 0 && b > 0)
	   {
		   throw new MyException("a > 0 && b > 0");
	   }
       else
       {
    	   retval = a * b; 
       }
       return retval;
	}
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, MyException
	{
		System.out.println("Enter a: ");
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		System.out.println("Enter b: ");
		String b = scan.next();
		try
	    {
		    double aDouble = Double.parseDouble(a);
		    double bDouble = Double.parseDouble(b);
		    double summa = sum(aDouble, bDouble);
		
		    System.out.println("SUMA: " + summa);
		    System.out.println("MINUS: " + minus(aDouble, bDouble));
		    System.out.println("DIVISION: " + division(aDouble, bDouble));
		    System.out.println("MULTI: " + multi(aDouble, bDouble));
	   }
	   catch (IllegalArgumentException ex)
	   {
		   System.out.println(ex);
	   }
	   catch (IllegalAccessException ex)
	   {
		   System.out.println(ex);
	   }
	   catch (ArithmeticException ex)
	   {
		   System.out.println(ex);
	   }
	   catch (MyException ex)
	   {
		   System.out.println(ex);
	   }
	   catch (Exception ex)
	   {
		   System.out.println(ex);
	   }
	    
	}

}

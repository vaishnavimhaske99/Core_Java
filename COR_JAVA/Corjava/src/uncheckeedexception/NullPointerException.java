package uncheckeedexception;

public class NullPointerException {
	public static void main (String[] args)  
	{  
 
	    String pntr = null;  
	  try  
	    {  
	      
	        if (pntr.equals("JTP"))  
	        {  
	            System.out.print("String are the same.");  
	        }  
	        else  
	        {  
	            System.out.print("Strinng are not the same.");  
	        }  
	    }  
	    catch(Exception e)  
	    {  
	        System.out.print("NullPointerException has been caught.");  
	    }  
	}  }
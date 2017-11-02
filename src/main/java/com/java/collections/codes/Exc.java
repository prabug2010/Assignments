package com.java.collections.codes;

public class Exc {
	
	
	    public static void main(String[] args)
	    {
	        try
	        {
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	        }
	        catch (ClassNotFoundException e)
	        {
	            e.printStackTrace();
	        }
	    }
	}

/**
 * 
 */
package com.srccodes.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author debabratak
 *
 */
public class Calculator {
	
	private static final Logger logger = 
			LoggerFactory.getLogger(Calculator.class);
//	private static double c;
	
	/**
	 * @param a
	 * @param b
	 * @return
	 */
	public double add(double a,double b){
		return a+b;
		
	}
	
	/**
	 * @param a
	 * @param b
	 * @return
	 */
	public double sub(double a,double b){
		double c;
		if(a>=b){
			c=a-b;
		}else{
			c=b-a;
		}
		return c;
		
	}
	
	/**
	 * @param a
	 * @param b
	 * @return
	 */
	public double mul(double a,double b){
		return a*b;
		
	}
	
	/**
	 * @param a
	 * @param b
	 * @return
	 */
	public double div(double a,double b){
		double c = 0;
		if(a>=b){
			if(b!=0){
				c=a/b;
			}else{
				logger.debug("Divisible should not be zero");
//				System.out.println("Divisible should not be zero");
			}
		}else{
			if(a!=0){
				c=b/a;
			}else{
				logger.debug("Divisible should not be zero");
//				System.out.println("Divisible should not be zero");
			}
			
		}
		return c;
		
	}

}

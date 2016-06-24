package com.srccodes.example;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalculatorTest {
	
	private Calculator cal;
	
	@BeforeTest
	public void setup(){
		 cal = new Calculator();
	}
	

  @Test
  public void add() {
	  double res = cal.add(2, 4);
	  Assert.assertEquals(res,6.0);
  }

  @Test
  public void sub1() {
	  double res = cal.sub(5, 2);
	  Assert.assertEquals(res,3.0);
  }
  @Test
  public void sub2() {
	  double res = cal.sub(2, 5);
	  Assert.assertEquals(res,3.0);
  }
  
 @Test
  public void sub3() {
	  Calculator cal = new Calculator();
	  double res = cal.sub(0, 0);
	  Assert.assertEquals(res,0.0);
  }
 
 @Test
 public void sub4() {
	  Calculator cal = new Calculator();
	  double res = cal.sub(0, -5);
	  Assert.assertEquals(res,5.0);
 }

  @Test
  public void mul() {
	  double res = cal.mul(2, 5);
	  Assert.assertEquals(res,10.0);
  }

  @Test
  public void div1() {
	  double res = cal.div(6, 2);
	  Assert.assertEquals(res,3.0);
  }
  @Test
  public void div2() {
	  double res = cal.div(2, 6);
	  Assert.assertEquals(res,3.0);
  }
  @Test
  public void div3() {
	  double res = cal.div(6, 0);
	  Assert.assertEquals(res,0.0);
  }
  @Test
  public void div4() {
	  double res = cal.div(0, 6);
	  Assert.assertEquals(res,0.0);
  }
}

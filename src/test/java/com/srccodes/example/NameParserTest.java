package com.srccodes.example;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.srccodes.example.dao.Person;
 
public class NameParserTest {
  private NameParser nameParser;
  private String[] names;
 
  @BeforeTest
  public void setUp() {
    nameParser = new NameParser();
    names = new String[]{"Mike Jones", "John Doe"};
  }
 
  @Test
  public void shouldFindPersonByLastName1() {
    Person person = nameParser.findPersonWithLastName(names, "Doe");
    String firstName = person.getFirstName();
    String lastName = person.getLastName();
    Assert.assertEquals("John", firstName);
  }
  
  /*@Test(expectedExceptions=ArrayIndexOutOfBoundsException.class)
  public void shouldFindPersonByLastName2() {
    Person person = nameParser.findPersonWithLastName(names, "Don");
//    String firstName = person.getFirstName();
//    String lastName = person.getLastName();
//    assertEquals("John", firstName);
  }*/
}
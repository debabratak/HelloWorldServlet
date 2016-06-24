/**
 * 
 */
package com.srccodes.example;

import org.junit.Before;
import org.testng.annotations.Test;

import com.srccodes.example.UserService;

/**
 * @author debabratak
 *
 */
public class UserServiceTest {
	
//	private static UserService mockedUserService;
	
	@Before
	public void setUp()  {
//	    //Create mock object of UserService
//		mockedUserService = Mockito.mock(UserService.class);
//
//	    //Create few instances of Book class.
//
//	    //Stubbing the methods of mocked BookDAL with mocked data. 
//		Mockito.when(mockedUserService.getRowCount()).thenReturn(14);
	}
	
	@Test
	public void testGetRowCount(){
		
		UserService mockedUserService = new UserService();
		
		int countOfRow = mockedUserService.getRowCount();
		
		System.out.println(countOfRow);
		
//		assertEquals(countOfRow,24);
		
		
	}

}

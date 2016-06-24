package com.srccodes.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.srccodes.example.dao.ManageUserData;

/**
 * @author debabratak
 *
 */
@Path("/WebService")
public class UserService {
	
	private static final Logger logger = 
			LoggerFactory.getLogger(UserService.class); 
	
	/**
	 * @return
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
//	public ArrayList<UserData> getRowCount() 
	public int getRowCount() 
	{
		
//		String fetch = null;
		int fetchData = 0;
		try 
		{
		ManageUserData manageUserData= new ManageUserData();
		fetchData = manageUserData.fetchData();
		}

		catch (Exception e)
		{
		logger.error("Exception Error"); //Console 
		}
		return fetchData;
		}

		
	}


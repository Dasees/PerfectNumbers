package org.dasees;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType; 

/**
 * Service class whose methods are exposed as REST API's
 * @author Dasees Gupta
 *
 */
@Path("/")
public class PerfectNumbersService {
	
	/**
	 * This API method is used to verify if input number is a perfect 
	 * number or not. This will return result in plain text format.
	 * @param number
	 * @return
	 */
	
	PerfectNumberResource perfectnum= new PerfectNumberResource();
	@GET 
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{number}")
	public String checkNumber(@PathParam("number") long number)
	
	{
		if(perfectnum.checkPerfectNumber(number))
		{
			return  number+ " is a perfect number";
		}
		else
			return  number+ " is not a perfect number";
	}
	
	/**
	 * This API method is used to return the list of perfect numbers within the range
	 * of numbers provided. Output is in JSON format.
	 * @param number1
	 * @param number2
	 * @return
	 */
	
	@GET 
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{number1}/{number2}")
	public List<PerfectNumber> getListOfPerfectNumbers(@PathParam("number1") long number1,@PathParam("number2") long number2)
	{  
		List<PerfectNumber> perfectnumberlist = null;
		if(number1<=number2) 
		{
			perfectnumberlist=perfectnum.getListOfPerfectNumbers(number1, number2) ;
		 
		}
	   return perfectnumberlist;
	}
	

}

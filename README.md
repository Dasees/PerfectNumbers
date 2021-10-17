# Perfect Numbers
Verify perfect numbers and get list of perfect numbers through REST API
**Overview**

In number theory, a perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself. For instance, 6 has divisors 1, 2 and 3 (excluding itself), and 1 + 2 + 3 = 6, so 6 is a perfect number.
Program has been written to compute check perfect number and provide list of perfect numbers. These methods are exposed as REST API’s
**Tools Used**
•	Java 8
•	Tomcat v9.0
•	Junit 4
•	Postman

**Solution For Perfect Numbers**

Following classes have been created to achieve the complete solution
• PerfectNumbersService : Class has been created to expose the above methods as REST API’s.
	  @GET 
	  @Produces(MediaType.APPLICATION_JSON)
	  @Path("/{number1}/{number2}")
	  public List<PerfectNumber> getListOfPerfectNumbers (@PathParam("number1") long number1,@PathParam("number2") long number2)
	
	  @GET 
	  @Produces(MediaType.TEXT_PLAIN)
	  @Path("/{number}")
	  public String checkNumber(@PathParam("number") long number)
• PerfectNumberResource : Class has been created with 2 methods:

  public boolean checkPerfectNumber(long number): 
  This method is used to check if provided number is perfect or not. Logic has been written to find the divisors of provided number , sum all the divisor values, check this       value against the input number.
  
  public List<PerfectNumber> getListOfPerfectNumbers(long number1, long number2):  
  This method is used to provide the list of perfect numbers within given range of input numbers. Both numbers in the range are included in computing perfect number list.
• PerfectNumber : POJO class for perfect number object.
• PerfectNumberTest: Class has been created for Junit testing of perfect number functionality.	

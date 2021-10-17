package org.dasees;

import java.util.ArrayList;
import java.util.List;
/**
 * Resource class having methods to check number is perfect or not and to compute perfect numbers list
 * @author Dasees Gupta
 *
 */
public class PerfectNumberResource {

	private List<PerfectNumber> numberList=new ArrayList<>();
		
	/**
	 * This method is used to check if provided number is a perfect number or not. Perfect numbers are those whose sum of divisors is 
	 * equal to number itself. e.g 6=1+2+3
	 * We are looping here till number/2. As after number/2 only possible divisor is number itself.
	 * @param number
	 * @return
	 */
		public boolean checkPerfectNumber(long number)
		{
			if(number>0)
				{
				int sumOfNumberDigits=0;
				for (int i=1;i<=number/2;i++)
				{
					if(number%i==0)
					{
						sumOfNumberDigits+=i;
					}
				}
				if(number==sumOfNumberDigits)
					{
					return true;
					}
				return false;
				}
			return false;
		}
		/**
		 * This method is used to provide list of perfect numbers within the given range of numbers 
		 * @param number1
		 * @param number2
		 * @return
		 */
		public List<PerfectNumber> getListOfPerfectNumbers(long number1, long number2)
		{
			
			while(number1<=number2)
			{
				if(checkPerfectNumber(number1))
				{				
					PerfectNumber numberobject= new PerfectNumber();
					numberobject.setPerfectnumber(number1);
					numberList.add(numberobject);
				}
				number1++;				
			}
			return numberList;
			
		}
		

	}

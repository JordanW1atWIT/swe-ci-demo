package com.demo;

public class FizzBuzz 
{
    String processNumber(int num)
	{	
    	if(num == 0)
          {
            return String.valueOf(0);  
          }
          else if(num % 15 == 0)
          {
            return "fizz buzz";
          }
          else if(num % 5 == 0)
          {
            return "buzz";
          }
          else if(num % 3 == 0)
          {
            return "fizz";
          }
          else
          {
            return String.valueOf(num);
          }
	}
	
	String processNumbers (int[] numList)
	{
    	String temp = "";
    if(numList.length == 0)
          {
            return "invalid";
          }
        for(int i = 0; i < numList.length; i++)
        {
          if(numList[i] == 0)
          {
            temp += String.valueOf(0) + ",";  
          }
          else if(numList[i] % 15 == 0)
          {
            temp += "fizz buzz,";
          }
          else if(numList[i] % 5 == 0)
          {
            temp += "buzz,";
          }
          else if(numList[i] % 3 == 0)
          {
            temp += "fizz,";
          }
          else
          {
            temp += String.valueOf(numList[i]) + ",";
          }
        }
        return temp;
	}

}

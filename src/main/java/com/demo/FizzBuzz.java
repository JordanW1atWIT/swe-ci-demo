package com.demo;

public class FizzBuzz 
{
    String processNumber(int num)
    {
        // Copy your code here
          if(num == 0)
          {
            return String.valueOf(0);
          }
          else if(num % 15 == 0)
          {
            return "FizzBuzz";
          }
          else if(num % 5 == 0)
          {
            return "Buzz";
          }
          else if(num % 3 == 0)
          {
            return "Fizz";
          }
          else
          {
            return String.valueOf(num);
          }
    }

    String processNumbers (int[] nums)
{
            String temp = "";
            if(nums.length == 0)
              {
                    return "invalid";
              }
        for(int i = 0; i < nums.length-1; i++)
        {
          if(nums[i] == 0)
          {
            temp += String.valueOf(0) + ", ";
          }
          else if(nums[i] % 15 == 0)
          {
            temp += "FizzBuzz, ";
          }
          else if(nums[i] % 5 == 0)
          {
            temp += "Buzz, ";
          }
          else if(nums[i] % 3 == 0)
          {
            temp += "Fizz, ";
          }
          else
          {
            temp += String.valueOf(nums[i]) + ", ";
          }


        }

    if(nums[nums.length - 1] == 0)
          {
            temp += String.valueOf(0);
          }
          else if(nums[nums.length - 1] % 15 == 0)
          {
            temp += "FizzBuzz";
          }
          else if(nums[nums.length - 1] % 5 == 0)
          {
            temp += "Buzz";
          }
          else if(nums[nums.length - 1] % 3 == 0)
          {
            temp += "Fizz";
          }
          else
          {
            temp += String.valueOf(nums[nums.length - 1]);
          }
        return temp;
    }

}

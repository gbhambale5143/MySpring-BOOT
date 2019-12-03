package com.example.demo;

import org.springframework.stereotype.Component;

@Component
  public class Sum {
  private int a=10;
  private int b=10;
  private int sum;
	
  
  public int Addition()
	{
	      	
		sum = a+b;
		
		return sum;
		
		
	}
	
	
}

package com.jspiders.map_type;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCountry
{
  public static void main(String[] args)
  {
  ClassPathXmlApplicationContext context = new  ClassPathXmlApplicationContext("com/jspiders/map_type/config.xml");
  
  Country c1 = (Country) context.getBean("country");
  
  System.out.println(c1);
  
  }
  
  
  
}

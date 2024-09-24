package com.com.webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGTest1 {
  @Test
  public void testcase1() 
  {
	  System.out.println("Hello all!Welcome to learn first test case in testng");
  }
  
  
  @Test
  public void testcase2()
  {
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.amazon.in");
	 System.out.println(driver.getTitle());
  }
  
  
  
}

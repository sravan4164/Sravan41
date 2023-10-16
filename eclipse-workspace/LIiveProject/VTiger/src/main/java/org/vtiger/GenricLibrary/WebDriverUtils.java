package org.vtiger.GenricLibrary;

import java.awt.Dimension;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtils {
	
/**
 * This method is used to open Web Application
 * @param driver is reference variable of WebDriver
 * @param url is reference variable of String
 */
	public void OpenWebApplication(WebDriver driver,String url) 
	{
		driver.get(url);
	}
	
/**
 * 	This method is used to fetcht Url of WebPage
 * @param driver is reference variable of WebDriver
 * @return give the Current url of webPage
 */
	
	public String fetchtUrlofWebPage(WebDriver driver, String currenturl) 
	{
		  return driver.getCurrentUrl();
		
	}
/**
 * 	This method is used to get tittle of WebPage
 * @param driver is reference variable of WebDriver
 * @return gives the Current tittle of webPage
 */
	
	public String GetTittleofWebPage(WebDriver driver,String tittle) 
	{
		return driver.getTitle();
		 
	}
	
/**
 * This method is used to maximize the WebPage	
 * @param driver is reference variable of WebDriver
 */
	public void MaximaizeWebPage(WebDriver driver) 
	{
		driver.manage().window().maximize();
	}
	
/**
 * This method is used to Minimize the WebPage	
 * @param driver is reference variable of WebDriver
 */
		public void MinimizeWebPage(WebDriver driver) 
		{
			driver.manage().window().minimize();
		}	
	
/**
 * 	 This method is used to resize the WebPage		
 * @param driver is reference variable of WebDriver
 * @param x paratmeters of int x
 * @param y
 
	public void ResizeTheWebPage(WebDriver driver,int x,int y)
	{
		Dimension d = new Dimension();
		driver.manage().window().setSize(d);
		Point p= new Point(x, y);
		driver.manage().window().setPosition(p);
		
	}
	*/
		
/**
* 	This method is used to Backward the WebPage		
* @param driver is reference variable of WebDriver
*/
	public void BackwardTheWebPage(WebDriver driver) 
	{
		driver.navigate().back();
	}
	
/**
* 	This method is used to Forward the WebPage		
* @param driver is reference variable of WebDriver
*/
	public void ForwardTheWebPage(WebDriver driver) 
	{
		driver.navigate().forward();
	}
	
/**
* 	This method is used to Refresh the WebPage		
* @param driver is reference variable of WebDriver
*/
	public void RefreshTheWebPage(WebDriver driver) 
	{
		driver.navigate().refresh();
	}	
	
/**
* This method is used to Open New Tab of WebPage		
* @param driver is reference variable of WebDriver
*/
	public void OpenNewTab(WebDriver driver)
	{
		driver.switchTo().newWindow(WindowType.TAB);
	}
	
/**
*This method is used to close that tab which is pointed by web driver reference variable 	
* @param driver is reference variable of WebDriver
*/
	public void Closethetab(WebDriver driver)
	{
		driver.close();
	}
	
/**
*This method is used to close the Tabs of WebPage 	
* @param driver is reference variable of WebDriver
*/
		public void Quite(WebDriver driver)
		{
			driver.quit();
		}
	
}










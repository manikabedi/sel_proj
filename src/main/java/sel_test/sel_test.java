package sel_test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class sel_test 
{
	@Test
	public void JenkinsTest() throws InterruptedException
    {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manikabedi\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com/");
		driver.manage().window().maximize();
		// next we will find a web element on the gmail.com web page. Go to email or phone field and right click to inspect it
		// next look for the element with input type email. This web element has a few attributes, that is how we will find that element
		driver.findElement(By.id("identifierId")).sendKeys("manikabedi@gmail.com");
		Thread.sleep(2000);			// sleep for 2000 milli seconds, this would require you to throw an interrupted exception
		// next we will click on next button, lets inspect it
		driver.findElement(By.className("CwaK9")).click();
		Thread.sleep(2000);			// sleep for 2000 milli seconds to slow down the test run for you to see
		// lets build a small test case
		String title = driver.getTitle();
		String ex_title = "gmail";
		// close the driver we have opened
		driver.close();
		
		if (title.equalsIgnoreCase(ex_title))
		{
			System.out.println("Test Success");
		}
		else
		{
			System.out.print("Test failed");;
		}
		
	}

}

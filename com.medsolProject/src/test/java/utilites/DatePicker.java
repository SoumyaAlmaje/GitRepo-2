package utilites;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.pages.BaseTest;

public class DatePicker extends BaseTest {
	
	public DatePicker(WebDriver driver)
	{
		this.driver=driver;
	}
    public void datePick() throws InterruptedException 
    {
    	driver.findElement(By.xpath("//input[@id='lastDonationDate']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@aria-label='Year']")).clear();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@aria-label='Year']")).sendKeys("2014");
		for(int x=0;x<=11;x++)
		{
			driver.findElement(By.xpath("//span[@class='arrowDown']")).click();
		}
		
		
		Thread.sleep(3000);
		WebElement mt= driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Select slt=new Select(mt);
		slt.selectByVisibleText("April");
		
		java.util.List<WebElement> dates=driver.findElements(By.xpath("//div[@class='dayContainer']/span")); 
		
		for(WebElement elem:dates)
		{
			
			String date=elem.getText();
			if(date.equals("15"))
			{
				elem.click();
				break;
			}
			
		}
		
    }
}

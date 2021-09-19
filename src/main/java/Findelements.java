import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;







import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Findelements {
	
	public static void main(String[] args) throws InterruptedException, AWTException   {
		
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			Thread.sleep(2000);
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			//driver.get("http://demo.guru99.com/test/upload/");
			driver.get("https://www.naukri.com/");
			 driver.findElement(By.id("wdgt-file-upload")).click();
			Clipboard board = Toolkit.getDefaultToolkit().getSystemClipboard();
			StringSelection str = new StringSelection("C:\\Users\\bujja\\Desktop\\Homeworks\\Test.docx");
			board.setContents(str, null);
			
			Robot rr = new Robot();
			rr.keyPress(KeyEvent.VK_CONTROL);
			rr.keyPress(KeyEvent.VK_V);
			rr.keyRelease(KeyEvent.VK_V);
			rr.keyRelease(KeyEvent.VK_CONTROL);
			
			rr.keyPress(KeyEvent.VK_ENTER);
			rr.keyRelease(KeyEvent.VK_ENTER);
			
			//driver.findElementById("wdgt-file-upload").click();
			/*Thread.sleep(2000);
			List<WebElement> elements = driver.findElements(By.name("name"));
		    System.out.println("Number of elements:" +elements.size());

		for(WebElement we : elements){
			System.out.println(we.getAttribute("value"));
		}
		
			WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

	        // enter the file path onto the file-selection input field
	        uploadElement.sendKeys("D:\\Selenium_Notes.pdf");

	        // check the "I accept the terms of service" check box
	        driver.findElement(By.id("terms")).click();

	        // click the "UploadFile" button
	        driver.findElement(By.name("send")).click();*/
			
}
}

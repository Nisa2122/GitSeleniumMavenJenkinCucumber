package browserSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserSetup {

	public WebDriver setupBrowser(String browser) {
		
		if(browser.equalsIgnoreCase("Chrome"))
			
		return new ChromeDriver();
		else if(browser.equalsIgnoreCase("edge"))
			
			return new EdgeDriver();
		else {
			System.out.println("Invalid Browser");
			return null;
		}
	}

}
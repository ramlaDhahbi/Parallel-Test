package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class ExecuteTestZaleniumFirefox1 {

	@SuppressWarnings("deprecation")
	@Test
	public void test1() throws MalformedURLException, InterruptedException {
		
//		FirefoxOptions browserOptions = new FirefoxOptions();
//		browserOptions.addArguments("-private");
//		browserOptions.setPlatformName("Windows 10");
//		browserOptions.setBrowserVersion("92");

		ChromeOptions chromeOptions = new ChromeOptions();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		WebDriver driver = new RemoteWebDriver(getRemoteUrl(), capabilities);

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.quit();

	}

	@SuppressWarnings("deprecation")
	private static URL getRemoteUrl() {
		try {
			return new URL("http://localhost:4444/wd/hub");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}

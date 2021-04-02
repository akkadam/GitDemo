import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\@AK@\\Ak\\Projects\\BrowserDrivers\\Version87\\chromedriver.exe");
		WebDriver i = new ChromeDriver();

		i.get("https://www.irctc.co.in/nget/train-search");

	}

}

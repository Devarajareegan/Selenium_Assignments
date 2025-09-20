package week2.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Url_Launch {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=774088017322&hvpos=&hvnetw=g&hvrand=1954716037106041768&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061919&hvtargid=kwd-64107830&hydadcr=14452_2429115&gad_source=1");
		driver.manage().window().maximize();
		driver.close();
		
	}

}

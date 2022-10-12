package utilityClass;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotClass 
{
	public static void screenshotmethod(WebDriver driver, String SSname) throws IOException
	{
		Date d = new Date();
		DateFormat d1 = new SimpleDateFormat("dd-MM-yy & HH-mm-ss");
		String date = d1.format(d);
				
		TakesScreenshot ts = (TakesScreenshot)driver;
		File salefile = ts.getScreenshotAs(OutputType.FILE);
		File myfile = new File("F:\\mahii\\Screenshot\\PolicyBazarSS\\"+SSname+date+".jpg");
		FileHandler.copy(salefile, myfile);
	}

}

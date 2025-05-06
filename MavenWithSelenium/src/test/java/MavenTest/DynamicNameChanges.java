package MavenTest;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DynamicNameChanges {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://saucelabs.com/");
        driver.manage().window().maximize();

        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File dest = new File("D:\\3_Other\\Ketan\\Important\\Personal\\Software Testing\\Training\\Screenshot\\Screenshot" + timestamp() + ".png");
        FileUtils.copyFile(src,dest);

        driver.close();
    }


    public static String timestamp(){
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());

    }
}

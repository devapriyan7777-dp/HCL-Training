import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class BrowserAutomation {
    public static void main (String [] args){
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com");
        System.out.println("Title:" +  driver.getTitle());
        System.out.println("URL;" + driver.getCurrentUrl());
        driver.navigate().refresh();
        driver.quit();
    }

}

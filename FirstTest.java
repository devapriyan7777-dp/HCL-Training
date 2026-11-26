import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class FirstTest {
    public static void main(String [] args){
        WebDriver driver = new EdgeDriver();        //creates a Chrome driver object reference as driver
        driver.get("https://www.microsoft.com");   //opens the website using url
        System.out.println(driver.getTitle());    //Get the title of the website
        driver.quit();                           //Closes the browser session
    }
}

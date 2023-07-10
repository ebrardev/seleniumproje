import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public  static  void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        JavascriptExecutor jsx= (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,450)");

        WebElement elementButton = driver.findElement(By.xpath("//h5[normalize-space()='Elements']"));
        elementButton.click();
        WebElement webTables = driver.findElement(By.xpath("//span[normalize-space()='Web Tables']"));
        webTables.click();
        JavascriptExecutor screen= (JavascriptExecutor) driver;
        screen.executeScript("window.scrollBy(0,-450)");
        WebElement addButton = driver.findElement(By.xpath("//button[@id='addNewRecordButton']"));
        addButton.click();
        WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
        firstName.click();
        firstName.sendKeys("comolokko");
        WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
        lastName.click();
        lastName.sendKeys("uuuuu");
        WebElement email = driver.findElement((By.xpath("//input[@id='userEmail']")));
        email.click();
        email.sendKeys("azdim@gmail.com");
        WebElement age = driver.findElement((By.xpath("//input[@id='age']")));
        age.click();
        age.sendKeys("22");
        WebElement salary = driver.findElement((By.xpath("//input[@id='salary']")));
        salary.click();
        salary.sendKeys("31");
        WebElement department = driver.findElement((By.xpath("//input[@id='department']")));
        department.click();
        department.sendKeys("31");

        WebElement submitButton = driver.findElement((By.xpath("//button[@id='submit']")));
        submitButton.click();
      driver.quit();
    }

}

package Task19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
       
        
        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        // Navigate to the webpage
        driver.get("https://www.guvi.in/register");
        
        driver.manage().window().maximize();
        
        // Example of locating elements using different locators
        
        // 1. ID
        WebElement elementById = driver.findElement(By.id("name"));
        elementById.sendKeys("Ravi");
        // 2. ClassName
        WebElement elementByClassName = driver.findElement(By.className("btn-form-control"));
        
        // 3. TagName
        WebElement elementByTagName = driver.findElement(By.tagName("input"));
        
        // 4. CSS Selector
        WebElement elementByCssSelector = driver.findElement(By.cssSelector("input[type='text']"));
        
        // 5. XPath
        WebElement elementByXpath = driver.findElement(By.xpath("//input[@id='username']"));
        
        
        
        
       
    }
}


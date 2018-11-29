package DDT;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
 
public class LinkedInWebsiteTesting {
 

 @Test(dataProvider="testdataset")
 public void fbLoginLogout(String email, String password) throws Exception{
 
 
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\mdladla\\eclipse\\chromedriver_win32\\chromedriver.exe");
 WebDriver driver = new ChromeDriver(); 

 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

 driver.get("https://www.linkedin.com/");

 driver.findElement(By.xpath("//*[@id=\"login-email\"]")).sendKeys(email);
 

 driver.findElement(By.xpath("//*[@id=\"login-password\"]")).sendKeys(password);
 
 driver.findElement(By.xpath("//*[@id=\"login-submit\"]")).click();
 
 driver.findElement(By.xpath("//*[@id=\"notifications-tab-icon\"]")).click();
 Thread.sleep(5000);
 
 driver.findElement(By.xpath("//*[@id=\"messaging-tab-icon\"]")).click();
 Thread.sleep(5000);
 
 driver.findElement(By.xpath("//*[@id=\"ember35\"]/input")).sendKeys("Global Kinetic");
 Thread.sleep(5000);
 
 driver.findElement(By.xpath("//*[@id=\"nav-search-controls-wormhole\"]/button")).click();
 Thread.sleep(5000);
 
 JavascriptExecutor js = (JavascriptExecutor) driver;  
 js.executeScript("window.scrollBy(0,500)");
 Thread.sleep(5000);
 
 driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[5]/DIV[6]/DIV[3]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[4]/UL[1]/LI[1]/A[1]/FIGURE[1]/DIV[1]/DIV[1]")).click();
 Thread.sleep(5000);
 
 
 driver.findElement(By.xpath("/HTML[1]/BODY[1]/DIV[5]/DIV[5]/DIV[2]/DIV[1]/DIV[2]/SECTION[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/BUTTON[1]")).click();
 Thread.sleep(5000);
 
 driver.findElement(By.xpath("/HTML[1]/BODY[1]/NAV[1]/DIV[1]/UL[1]/LI[6]/DIV[1]/BUTTON[1]")).click();
 Thread.sleep(5000);
 

 driver.findElement(By.xpath("//*[@href='/m/logout/']")).click();
 Thread.sleep(5000);
 
 }
 
 
 // @DataProvider passes data to test cases. Here I took 2 dimension array. 
 @DataProvider(name="testdataset")
 public Object[][] getData(){

 // first parameter is row and second one is column
 Object[][] data = new Object[1][2];
 data[0][0] = "ZaneleZanele.Blose@gmail.com";
 data[0][1] = "ZBlose.Blose";
 
 
 return data;
 }
 
 }

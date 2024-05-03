import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class pulseautomate {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        //Heading to datamatics pulse site
        driver.get("https://www.pulse.datamatics.com/dlintranet/Login.do?method=showLogin");
        //Print parent wiwndow handle
        String parenthandle = driver.getWindowHandle();
        System.out.println("the parent window handle is"+parenthandle);
        //Enter login id
        driver.findElement(By.xpath("//input[@name='emp_code']")).sendKeys("170171");
        //Enter password
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("@Datamatics1");
        //performing operation
        driver.findElement(By.xpath("//input[@id='button']")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[9]/a/span")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//body[1]/div[8]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/ul[1]/li[7]/a[1]")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//body[1]/div[8]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/a[1]")).click();

    }
}

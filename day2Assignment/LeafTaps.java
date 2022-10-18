package Week2.day2Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTaps {
public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	EdgeDriver driver = new EdgeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("ARUNKUMAR");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
	
	
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("ARUN");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation Tester");
	driver.findElement(By.name("description")).sendKeys("None");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("iamarunofficial100@gmail.com");
	driver.findElement(By.name("submitButton")).click();
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.name("description")).clear();
	driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("None");
	driver.findElement(By.className("smallSubmit")).click();
	String title = driver.getTitle();
	System.out.println(title);
}
}

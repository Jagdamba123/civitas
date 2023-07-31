package pOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PomClass {
	WebDriver driver;
	@FindBy (xpath="//*[@id='nav-logo-sprites']") //basic
	private WebElement logo;
	@FindBy (xpath="(//span[contains(@class,'nav-line-1')])[1]") //contains
	private WebElement navigation;
	@FindBy (xpath="//*[starts-with(@style,'display: none;')]//following-sibling::input") // following-sibiling
	private WebElement searchbox;
	@FindBy (xpath="//*[@class='nav-line-1']/parent::span")//parent
	private WebElement language;
	@FindBy (xpath="")

}

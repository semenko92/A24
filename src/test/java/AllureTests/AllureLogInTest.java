package AllureTests;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Step;
import General.TestBase;
import ScreenElements.CardSwipe;
import ScreenElements.MainScreenElements;
import ScreenElements.OnboardingElements;
import ScreenElements.ProfileSettingsPage;



public class AllureLogInTest extends TestBase {
AndroidDriver driver;
OnboardingElements onboardingElements;
MainScreenElements mainScreenElements;
CardSwipe cardSwipe;


ProfileSettingsPage profileSettingsPage;




@Test(description="Check the possibility open card reissue")

public void checklogInTest() {
	loginTest();
	chooseAnotherLanguage();
	
}
@Step ("Login")
public void loginTest() {
	onboardingElements.phoneNumberField.sendKeys("638389626");
	 WebDriverWait wait = new WebDriverWait(driver, 30);
	 wait.until(ExpectedConditions.elementToBeClickable(onboardingElements.TwoPinButton));
	onboardingElements.TwoPinButton.click();
	onboardingElements.FivePinButton.click();
	onboardingElements.EightPinButton.click();
	onboardingElements.ZeroPinButton.click();
	
	onboardingElements.FirstOtpNumber.sendKeys("7");
	onboardingElements.SecondOtpNumber.sendKeys("1");
	onboardingElements.ThirdOtpNumber.sendKeys("7");
	onboardingElements.FourthOtpNumber.sendKeys("2");
	onboardingElements.NextButtonAfterOtp.click();

}

@Step("Choose Russian Language")
public void chooseAnotherLanguage() {
	//changeLanguage.chooseRussianLanguage();
	/*
	mainScreenElements.AvatarSettingsButton.click();
	profileSettingsPage.ChangeLanguageButton.click();
	profileSettingsPage.RussiaLanguageButton.click();
	profileSettingsPage.SaveChangeLanguageButton.click();
	
}
/*
	@Step ("Check the changis of the card on a main screen")
	public void findTheCorrectCard() {

		swipeCard.swipeTheCard(driver);
		
		}
	*/
 

}
	
@BeforeTest
public void beforeTest() throws MalformedURLException {
	// AndroidDriver<AndroidElement> driver = mycapabilities();
	 driver=mycapabilities();
	 onboardingElements=new OnboardingElements(driver);
	 mainScreenElements=new MainScreenElements(driver);
	 
	
	 WebDriverWait wait = new WebDriverWait(driver, 30);
	 wait.until(ExpectedConditions.elementToBeClickable(By.id("ua.com.abank:id/etPhoneNumber")));
	
}
}
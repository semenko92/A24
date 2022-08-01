package DepositsScreenElements;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DepositsPage {
	public DepositsPage(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.ImageView[1]")
	public MobileElement OpenDepositButton;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.ImageView[1]")
	public MobileElement KopilkaButton;
	
	@AndroidFindBy(id="ua.com.abank:id/etAmount")
	public MobileElement AddDepositSummField;
	
	@AndroidFindBy(id="ua.com.abank:id/tvCurrency")
	public MobileElement ChooseCurrencySwitchButton;
	
	@AndroidFindBy(id="ua.com.abank:id/tvRate")
	public MobileElement PercentOfTheDeposit;
	
	@AndroidFindBy(id="ua.com.abank:id/sbPeriod")
	public MobileElement ChangeMonthDepositElement;
	
	@AndroidFindBy(id="ua.com.abank:id/ivInfo")
	public MobileElement InfoButton;
	
	@AndroidFindBy(id="ua.com.abank:id/tvCapitalization")
	public MobileElement AddToDepositText;
	
	@AndroidFindBy(id="ua.com.abank:id/swCapitalization")
	public MobileElement CapitalizationSwitch;
	
	@AndroidFindBy(id="ua.com.abank:id/tvTermination")
	public MobileElement DostrokoveRozirvannyaText;
	
	@AndroidFindBy(id="ua.com.abank:id/swTermination")
	public MobileElement TerminationSwitch;
	
	
	
	
	
	
}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	// Construtor

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// Elementos
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/main/div[2]/div/div[1]/div[2]/div/div/a")
	private WebElement verOfertasButton;
	
	// Acoes
	
	public void verOfertasButton_click() {
		verOfertasButton.click();
	}
	
}

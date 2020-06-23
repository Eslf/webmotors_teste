package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ResultadoDaBuscaPage {

	// Construtor

	public ResultadoDaBuscaPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// Elementos
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/main/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/div/div/a[4]/small")
	private WebElement hondaTagA;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/main/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/div[2]/div[2]")
	private WebElement modelosField; 
	
	@FindBy(how = How.LINK_TEXT, using = "CITY")
	private WebElement cityModelosField;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/main/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/div[2]/div[3]")
	private WebElement versaoField;
	
	@FindBy(how = How.LINK_TEXT, using = "1.5 EXL 16V FLEX 4P AUTOMÁTICO")
	private WebElement exlFlexATVersaoField;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/main/div[1]/div[3]/div[2]/div/div/div/div[1]/div/div[2]/a[1]/div/h2")
	private WebElement marcaModeloNameText;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/main/div[1]/div[3]/div[2]/div/div/div/div[1]/div/div[2]/a[1]/div/h3")
	private WebElement versaoNameText;
	
	
	
	// Acoes
	
	public void selecionaMarcaHonda_click(WebDriver driver) {
		WebDriverWait wait_marcaFilter = new WebDriverWait(driver, 3);
		wait_marcaFilter.until(ExpectedConditions.visibilityOf(hondaTagA));
		hondaTagA.click();
	}
	
	public void selecionaModeloCity_Filter(WebDriver driver) {
		modelosField.click();
		WebDriverWait wait_modeloFilter = new WebDriverWait(driver, 3);
		wait_modeloFilter.until(ExpectedConditions.visibilityOf(cityModelosField));
		cityModelosField.click();;
	}
	
	public void selecionaVersao_Filter(WebDriver driver) {
		WebDriverWait wait_versaoFieldFilter = new WebDriverWait(driver, 3);
		wait_versaoFieldFilter.until(ExpectedConditions.visibilityOf(versaoField));
		versaoField.click();
		WebDriverWait wait_versaoFilter = new WebDriverWait(driver, 3);
		wait_versaoFilter.until(ExpectedConditions.visibilityOf(exlFlexATVersaoField));
		exlFlexATVersaoField.click();
	}
	
	public void marcaModeloNameText_assertion(WebDriver driver) {
		WebDriverWait wait_nomeMarcaModelo = new WebDriverWait(driver, 5);
		wait_nomeMarcaModelo.until(ExpectedConditions.visibilityOf(marcaModeloNameText));
		assertThat(marcaModeloNameText.getText(), is ("HONDA CITY"));
	}
	
	public void versaoNameText_assertion(WebDriver driver) {
		assertThat(versaoNameText.getText(), is ("1.5 EXL 16V FLEX 4P AUTOMÁTICO"));
	}
	
}

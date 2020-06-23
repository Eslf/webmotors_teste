package steps_mapper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.ResultadoDaBuscaPage;
import cucumber.api.java.en.Then;

public class Step_mapping {

	private static WebDriver driver;
	
	
	@Given ("Acessada a pagina da Webmotors")
	   public void webmotors_homePage_open() {
	   	System.setProperty("webdriver.firefox.driver", "/usr/local/bin/geckodriver");
			driver = new FirefoxDriver();
		    driver.get("https://www.webmotors.com.br/");
		    driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
	   }
	
	@And ("E clicado no botao para acessar a pagina de resultados de busca")
	public void resultadoDeBuscaPage_Open() {
		HomePage homePage = new HomePage(driver);
		homePage.verOfertasButton_click();
	}
	
	@When ("Ao selecionar no filtro a marca Honda")
	public void marcaFilter() {
		ResultadoDaBuscaPage resultadoDaBuscaPage = new ResultadoDaBuscaPage(driver);
		resultadoDaBuscaPage.selecionaMarcaHonda_click(driver);
	}
	
	@And ("o modelo City e uma das versoes")
	public void modeloEVersaoFilter() {
		ResultadoDaBuscaPage resultadoDaBuscaPage = new ResultadoDaBuscaPage(driver);
		resultadoDaBuscaPage.selecionaModeloCity_Filter(driver);
		resultadoDaBuscaPage.selecionaVersao_Filter(driver);
	}
	
	@Then("O site retorna um Honda City da versao selecionada")
	public void validacaoFilter() {
		ResultadoDaBuscaPage resultadoDaBuscaPage = new ResultadoDaBuscaPage(driver);
		resultadoDaBuscaPage.marcaModeloNameText_assertion(driver);
		resultadoDaBuscaPage.versaoNameText_assertion(driver);
		driver.close();
	}
	
	// Passos exclusivo para o segundo cenario

	@Given ("Acessada a pagina da loja na Webmotors")
	   public void lojaNaWebmotors_homePage_open() {
			driver = new FirefoxDriver();
		    driver.get("https://www.webmotors.com.br/carros/estoque/?IdRevendedor=3834764&TipoVeiculo=carros&anunciante=concession%C3%A1ria%7Cloja");
		    driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
	   }

}

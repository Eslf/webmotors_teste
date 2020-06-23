# webmotors_teste

## Configuração de ambiente

Procure pelo arquivo "Step_mapping.java", localizado em src/test/java/steps_mapper e encontre a seção:

```java
   @Given ("Acessada a pagina da Webmotors")
   public void webmotors_homePage_open() {
   	System.setProperty("webdriver.firefox.driver", "FIREFOX_PATH");
		driver = new FirefoxDriver();
	    driver.get("https://www.webmotors.com.br/");
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
   }
```

  Onde possui **"FIREFOX_PATH"**, substitua pelo diretório onde se encontra o arquivo de driver do 
  Mozilla Firefox ("Geckodriver").
  
##  Execução de Testes
  
  Para executar os cenários de teste, encontre o arquivo **"Steps_execution.java"** localizado em src/test/java/steps_runner e clique com o botão direito do mouse. No menu, vá até **"Run as"** e selecione a opção **"JUnit Test"**.

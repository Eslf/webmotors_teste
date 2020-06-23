Feature: Buscar o carro Honda City pelo filtro

Scenario: Acessar a pagina da Webmotors, entrar nos resultados de busca e filtrar por Honda City

Given Acessada a pagina da Webmotors
And E clicado no botao para acessar a pagina de resultados de busca
When Ao selecionar no filtro a marca Honda
And o modelo City e uma das versoes
Then O site retorna um Honda City da versao selecionada

Scenario: Acessar a pagina de uma loja na Webmotors e filtrar por Honda City

Given Acessada a pagina da loja na Webmotors
When Ao selecionar no filtro a marca Honda
And o modelo City e uma das versoes
Then O site retorna um Honda City da versao selecionada

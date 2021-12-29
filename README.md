# Adaptadores de entrada

Esse repositório contém os adaptadores de entrada do sistema exemplo de transferência bancária criado para estudo da arquitetura hexagonal.

Para esse caso foi feito apenas um adaptador de front-end usando a biblioteca do JavaFX, mas um adaptador de entrada pode ser um controller rest, um consumidor de mensagens ou até uma suite de testes.

## Build

Para fazer o build da aplicação é necessário seguir os passos abaixo:
* Instalar o Java 12.
* Clonar os repositórios de [core](https://github.com/Tales313/hexag-core), [desktop](https://github.com/Tales313/hexag-desktop) e [servicos](https://github.com/Tales313/hexag-servicos).
* Fazer o build dos projetos de core e servicos, gerando um arquivo .jar de cada um.
* Alterar no pom.xml do projeto desktop, o caminho para o arquivo .jar dos outros 2 projetos.
* Fazer o build do projeto desktop e rodá-lo (para alterar o ambiente (dev ou hml) é preciso escolher no arquivo AdaptadoraJavaFx a classe de Build).
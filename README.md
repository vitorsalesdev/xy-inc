# XY POIs Location
📜	Esse é um projeto feito como teste da  Zup Innovation. Tem como objetivo disponibilizar três tipos de serviço.
### Atenção: apenas os serviços 1 e 2 foram implementados nesta versão.
 - Serviço 1 - Cadastrar pontos de interesse, com 3 atributos: Nome do POI, coordenada X (inteiro não negativo) e coordenada Y (inteiro não negativo). Os POIs devem ser armazenados em uma base de dados. 

- Serviço 2 - Listar todos os POIs cadastrados. 

- Serviço 3 - Listar POIs por proximidade. Este serviço recebe uma coordenada X e uma coordenada Y, especificando um ponto de referência, como uma distância máxima (d-max) em metros. O serviço retorna todos os POIs da base de dados que estejam a uma distância menor ou igual a d-max a partir do ponto de referência.





## 🛠 Como executar o projeto?


### Pré-requisitos:

-   [JDK 15](https://adoptopenjdk.net/) instalado em seu computador.
-   Um cliente para conectar com o Banco de dados MySQL, exemplo:  [Xaamp](https://www.apachefriends.org/pt_br/download.html).
-   Cliente para realizar requisições REST:  Recomendo o [Postman](https://www.getpostman.com/)  ou  [Swagger](http://localhost:8080/swagger-ui.html#/)(acessível para iniciar após iniciar a aplicar).
- Clonar o repositório através do comando:
git clone https://github.com/vitorsalesdev/xy-inc.git

  ### Execução:
 - Iniciar o cliente para conectar o MySQL
- Acessar a pasta do projeto(xy-poi)
- Executar o seguinte comando no terminal:
java -jar xylocation.jar


## 📈 Exemplo de uso


# XY POIs Location

📜 Esse é um projeto feito como teste da  Zup Innovation. Tem como objetivo disponibilizar três tipos de serviço.

 - Serviço 1 - Cadastrar pontos de interesse, com 3 atributos: Nome do POI, coordenada X (inteiro não negativo) e coordenada Y (inteiro não negativo). Os POIs devem ser armazenados em uma base de dados. 

- Serviço 2 - Listar todos os POIs cadastrados. 

- Serviço 3 - Listar POIs por proximidade. Este serviço recebe uma coordenada X e uma coordenada Y, especificando um ponto de referência, como uma distância máxima (d-max) em metros. O serviço retorna todos os POIs da base de dados que estejam a uma distância menor ou igual a d-max a partir do ponto de referência.


## 🛠 Como executar o projeto?

### Pré-requisitos:

-   [JDK 8](https://adoptopenjdk.net/) instalado em seu computador.
-   Um cliente para conectar com o Banco de dados MySQL, exemplo:  [Xaamp](https://www.apachefriends.org/pt_br/download.html).
-   Cliente para realizar requisições REST:  Recomendo o [Postman](https://www.getpostman.com/)  ou  [Swagger](http://localhost:8080/swagger-ui.html#/)(acessível para iniciar após iniciar a aplicação).
- Clonar o repositório através do comando:
git clone https://github.com/vitorsalesdev/xy-inc.git

 ### Execução:
 - Iniciar o cliente para conectar com o MySQL
- Acessar a pasta do projeto(xy-poi) pelo terminal.
- Executar o seguinte comando no terminal:
java -jar xy-poi.jar


## 📈 Exemplo de uso
### Serviço 1 - Cadastrar um ponto de interesse

- Para utilizar esse para serviço é preciso enviar através do cliente de requisições um Json contendo nome, x(coordenada), y(coordenada). Utilize POST e o Endpoint http://localhost:8080/cadastro. Veja o exemplo a seguir:

<a href="https://imgur.com/At2lwMy"><img src="https://i.imgur.com/At2lwMy.png" title="source: imgur.com" /></a>

### Serviço 2 - Listar todos os pontos de interesse

- Listar todos os pontos de interesse cadastrados é muito simples, basta fazer uma requisição GET no Endpoint http://localhost:8080/listar

<a href="https://imgur.com/463KJ7L"><img src="https://i.imgur.com/463KJ7L.png" title="source: imgur.com" /></a>

### Serviço 3 - Localizar pontos de interesse próximos
- - Para utilizar esse serviço é necessário enviar um Json contendo uma localização de referência e distancia máxima até os pontos de interesse . O  Json deve conter x(coordenada), y(coordenada) e dmax(distância máxima). Utilize POST e o Endpoint http://localhost:8080/localizar. Veja o exemplo:

<a href="https://imgur.com/ZKZb1jq"><img src="https://i.imgur.com/ZKZb1jq.png" title="source: imgur.com" /></a>

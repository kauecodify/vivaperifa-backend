-------------------------------------------------------------------------------------------

**Comunicação via Spring Data para interagir com o banco de dados MongoDB**

*Tela de login*


![tela](tela.png)


Segurança > implementar funções de hash para armazenamento BCrypt

conexão > SpringBoot para MongoDB usando SpringDataMongoDB.

-------------------------------------------------------------------------------------------

**application.properties.java**

**em (pom.xml) a dependência #'spring-boot-starter-data-mongodb'# precisa estar alocada**


spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.database=mydatabase


-------------------------------------------------------------------------------------------

 **application.yml ou json {}.** 

      spring:

        data:

          mongodb:

            host: localhost

              port: 27017

                database: mydatabase

-------------------------------------------------------------------------------------------
**Dependência no arquivo pom.xml**


<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-mongodb</artifactId>
</dependency>

------------------------------------------------------------------------------------------

**configurar a classe conforme projeto**

@SpringBootApplication 

-------------------------------------------------------------------------------------------
**MyApplication.java**

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class MyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}

------------------------------------------------------------------------------------------

**RESUMO**

A aplicação Spring Boot se conectará ao MongoDB local na porta padrão 27017 e usará o banco de dados "mydatabase".


A dependência spring-boot-starter-data-mongodb permitirá a comunicação com o MongoDB através do Spring Data MongoDB.


A classe MyApplication é a classe principal da aplicação Spring Boot, responsável por inicializá-la e permitir sua execução.

------------------------------------------------------------------------------------------




*Tela de login*

![tela](tela.png)

**Comunicação via Spring Data MongoDB para interagir com o banco de dados MongoDB**

Segurança > implementar funções de hash para armazenamento BCrypt

conexão > SpringBoot para MongoDB usando SpringDataMongoDB.

 **em (pom.xml) a dependência #'spring-boot-starter-data-mongodb'# precisa estar alocada**
 
application.properties
spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.database=mydatabase

 application.yml ou json {}.
      spring:
        data:
          mongodb:
            host: localhost
              port: 27017
                database: mydatabase

@SpringBootApplication #configurar a classe conforme projeto

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication


public class MyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}

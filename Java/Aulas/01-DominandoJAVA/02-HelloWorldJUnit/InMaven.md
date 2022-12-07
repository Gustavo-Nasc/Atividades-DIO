# Java

## Curso: Testes Unitários com JUnit

### Aula 02 - Hello World com JUnit

#### JUnit - Maven

O Primeiro passo é criar o projeto Projeto em Maven

Então, logo após, dentro da pasta do seu projeto, no arquivo *"pom.xml"*:

```xml
<!-- Projetct/pom.xml -->

<project>
    <dependencies>
        <!-- https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-engine -->
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-engine</artifactId>
            <version>5.8.2</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
</project>
```

Você pode criar as mesmas classes e executar os mesmos testes para verificar se os testes são executados com sucesso
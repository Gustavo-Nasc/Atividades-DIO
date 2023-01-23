# Java

## Gerenciamento de Dependências e Build em Java com Maven

### Aula 04 - POM

#### POM

**POM** é a abreviação para *Project Object Model*
- É a unidade fundamental de trabalho do *Apache Maven*
- É um arquivo no formato *.xml*
- É o POM quem detalha o projeto, como construir o projeto, como buildar, como empacotar.
- O Maven sempre procura pelo arquivo *pom.xml* para realizar sua execução

#### pom.xml

O arquivo *pom.xml* possui os detalhes do projeto, tais como:
- Nome do projeto
- Dependências
- Módulos
- Configurações de build
- Detalhes do projeto (nome, descrição, licença, url)
- Configurações de ambiente (repositórios, tracking, profiles)

Observe o exemplo abaixo e confira quais as informações possível para o *pom.xml*:
```xml
<!-- pom.xml -->

<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <!-- The Basics -->
    <groupId>...</groupId>
    <artifactId>...</artifactId>
    <version>...</version>
    <packaging>...</packaging>
    <dependencies>...</dependencies>
    <parent>...</parent>
    <dependencyManagement>...</dependencyManagement>
    <modules>...</modules>
    <properties>...</properties>

    <!-- Build Settings -->
    <build>...</build>
    <reporting>...</reporting>

    <!-- More Project Information -->
    <name>...</name>
    <description>...</description>
    <url>...</url>
    <inceptionYear>...</inceptionYear>
    <licenses>...</licenses>
    <organization>...</organization>
    <developers>...</developers>
    <contributors>...</contributors>

    <!-- Environmnet Settings -->
    <issueManagement>...</issueManagement>
    <ciManagement>...</ciManagement>
    <mailingLists>...</mailingLists>
    <scm>...</scm>
    <prerequisistes>...</prerequisistes>
    <repositories>...</repositories>
    <pluginRepositories>...</pluginRepositories>
    <distributionManagement>...</distributionManagement>
    <profiles>...</profiles>
</project>
```

---

Se consultarmos a documentação do Apache Maven. Para que o projeto funcione, precisamos apenas da seção básica (modelVersion, groupId, artifactId e version)

Portanto, o modelo acima é apenas para base, nem todas as informações são obrigatórias. As únicas obrigatórias são as básicas, citadas acima.

Porém, o *pom.xml* não é executado somente com as informações básicas, pois o Maven trabalha com o conceito de Herança, no qual também se extende para o *POM*.

Se declararmos o *pom.xml* somente com aquelas informações, ele extenderá as demais informações a partir de um *Super POM*

#### Super POM

O **Super POM** é um modelo base, no qual possui todas as configurações padrão que o Maven utiliza. Se decidirmos sobrescrever algumas dessas propriedades/configurações base, o nosso *pom.xml* irá ser executado de outra forma especificada. Caso contrário, o Maven busca as informações do Super POM e o utiliza.

Todas as informações possíveis de um *Super POM* estão disponíveis na documentação do Apache Maven, atráves [desse link](https://maven.apache.org/ref/3.0.4/maven-model-builder/super-pom.html).
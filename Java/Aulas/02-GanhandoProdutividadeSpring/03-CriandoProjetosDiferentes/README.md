# Java

## Gerenciamento de Dependências e Build em Java com Maven

### Aula 03 - Criando diferentes tipos de projeto

#### Maven Archetype
É possível criar diferentes tipos de projetos graças ao **Maven Archetype**. 

O **Maven Archetype** nada mais é que um *template*, que possibilita a personalização e configuração de como um projeto será construído, definindo components, organização de pacotes, organização de arquivos etc.

Dessa forma, conseguimos construir diversos tipos de *templates* ou *arquétipos* para diversas finalidades.

##### Exemplo

Vamos supor que eu precise de um projeto Web que faça o [Empacotamento EAR](https://medium.com/@rafaelvicio/jar-war-ear-e79fed877bd1) e que já tenha determinadas dependências.

Podemos buscar na web um projeto que já tenha essas características, por meio do *arquétipo*.

##### Como encontrar

Para buscarmos um projeto, podemos buscar na  web por *maven arquetype list*, ou acessar [esse link](https://maven.apache.org/archetypes/), referente a **Maven Archertype**, da **Apache**.

Para cada projeto da lista inacabável de projetos há uma instrução de execução do *mvn archetype*, portanto, basta olhar a documentação de cada projeto.
# Java

## Gerenciamento de Dependências e Build em Java com Maven

### Aula 02 - Comandos que auxiliam o dia a dia

Todos os comandos Maven devem ser executados em terminal, com o operador *mnv*.

#### compile

O comando *compile* é um comando utilizado para compilar as classes do seu projeto, conforme exemplo:

```powershell
mvn compile
```

Quando utilizamos o *compile*, todos os códigos JAVA do projeto serão compilados e transformados em classes na pasta *target*

Também é possível utilizar o sufixo *-X*, para que o código seja compilado com o Debug, conforme exemplo:

```powershell
mvn compile -X
```

---

#### test

O comando *test* é um comando utilizado para realizar os testes da nossa aplicação.

```powershell
mvn test
```

Quando utilizamos o *test*, o Maven, de forma automática, lê e executa todas as classes presentes na pasta *test* da nossa aplicação JAVA, executantos os testes propostos.

Também é possível utilizar o sufixo *-X* para que o código seja compilado com o Debug, conforme exemplo:

```powershell
mvn test -X
```

---

#### package

O comando *package*, como o próprio nome diz, ele empacota a aplicação, ou seja, ele irá transformar toda a aplicação em um *Arquivo Executável JAVA* (.jar)

```powershell
mvn package
```

Assim como os demais acima, é possível utilizar o sufixo *-X* para utilizar o *package* com o Debug.

```powershell
mvn package -X
```

---

#### clean

O comando *clean* do Maven é utilizado para limpar o projeto, apagando a pasta *target* da aplicação.

```powershell
mvn clean
```
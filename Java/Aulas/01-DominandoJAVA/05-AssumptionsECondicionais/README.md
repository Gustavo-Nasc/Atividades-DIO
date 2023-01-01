# Java

## Curso: Testes Unitários com JUnit

### Aula 05 - Assumptions e Testes condicionais

#### Assumptions

Como o próprio nome diz, traduzido, as *Assumptions* estão atreladas a **suposições**, ou seja, está relacionado a assumir uma determinada condição.

É executada a partir de um *@Test*, porém, para executar determinada situação daquele teste, iremos validar uma condição, ou seja, presumir que aquilo só será executado em determinada condição.

Para demonstrar a utilização das *Assumptions*, o seguinte código é testado:

```java
@Test
void validarSomenteNoUsuarioDiferenteDoAdmnistrador() {
    Assumptions.assumeFalse("Administrador".equals(System.getenv("USER")));
    Assertions.assertEquals(10, 5 + 5);
}
```

Esse código só será executado caso o *USER* que estiver sendo utilizado for diferente de "Administrador". Do contrário, o código de teste não é concluído.

---

#### Testes Condicionais

As *Condicionais* são executadas de maneiras semelhantes, porém, os **Testes Condicionais** possuem um Nível de elaboração melhor no JUnit

Nos Testes Condicionais, nós não utilizamos as *Assumptions*.

##### @EnabledIfEnvironmentVariable

Só será 'Enabled', ou seja, executado quando a Variável passada for a passada como parâmetro

```java
@Test
@EnabledIfEnvironmentVariable(named = "USER", matches = "Administrador")
void validarSomenteNoUsuarioADM() {
    Assertions.assertEquals(10, 5 + 5);
}
```

---

##### @DisabledIfEnvironmentVariable

Só será 'Disabled', ou seja, executado quando a Variável passada for diferente da passada como parâmetro

```java
@Test
@DisabledIfEnvironmentVariable(named = "USER", matches = "Administrador")
void validarSomenteNoUsuarioDiferenteDoADM() {
    Assertions.assertEquals(10, 5 + 5);
}
```

---

##### @DisabledIfEnvironmentVariable

Só será executado quando o Sistema Operacional for 'Linux'. Serve para os demais SO (OS.*WINDOWS*, OS.*AIX*, OS.*MAC*, OS.*SOLARIS*, OS.*OTHER*).

```java
@Test
@EnabledOnOs(OS.LINUX)
void validarSomenteNoSistemaLinux() {
    Assertions.assertEquals(10, 5 + 5);
}
```

Pode também ser executado em mais de um SO, conforme exemplo:

```java
@Test
@EnabledOnOs({OS.LINUX, OS.WINDOWS})
void validarNosSistemasWindowsLinux() {
    Assertions.assertEquals(10, 5 + 5);
}
```

---

##### @EnabledOnJre

Só será executado quando a versão do JAVA for a especificada

```java
@Test
@EnabledOnJre(JRE.JAVA_18)
void validarSomenteNoJava18() {
    Assertions.assertEquals(10, 5 + 5);
}
```

---

#####  @EnabledForJreRange

É executado nas versões JAVA passadas como parâmetro, conforme exemplo:

```java
@Test
@EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_18)
void validarNosJava17e18() {
    Assertions.assertEquals(10, 5 + 5);
}
```
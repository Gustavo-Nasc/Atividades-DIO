# TypeScript

## Curso: Programação Orientada a Objetos com TypeScript

### Aula 05 - Visibilidade de atributos e métodos

#### Visibilidade
Vamos imaginar a seguinte situação:
Você comprou um carro. Você sabe que esse carro possui muitas partes, muitos componentes que, como um todo, se tornam o carro. Diferentes ações como motorista acionam diferentes partes do carro, como acelerar, freiar etc.

Mas, a questão é: "Você tem acesso a essas partes, como funciona o processo dessas ações?"

A resposta é "não". Nós, como condutores, não temos acesso a todas as partes do carro, não cabe a nós sabermos esses detalhes.

Com um Software é a mesma coisa, não cabe ao usuário saber de detalhes da aplicação, métodos internos, atributos privados etc. Por esse motivo, trabalhamos com as **Visibilidades**.
```ts
// Note que, em primeiro momento, nós podemos instanciar um novo nome para uma 'Account', apenas passando em código:
peopleAccount.name = "Gustavo Souza";
```

O código acima não é viável, pois estamos manipulando o dado de maneira direta, sem um intermédio.

Quando estamos trabalhando com Objetos, optamos por deixar os Atributos privados, para que esses atributos sejam manipulados por meio de Métodos de Acesso (Getters e Setters)

```ts
export abstract class DioAccount {
    private name: string;
    private accountNumber: number;
    private balance: number = 0;

    // Métodos de Acesso (Getters e Setters)

    // Para 'setar' valores, utilizamos os Setters
    // Note que damos um nome sugestivo a função: 'setar nome', passando como parâmetro um 'name', que é uma string e informando que não há retorno ('void')
    setName(name: string): void {
        this.name = name;
    };

    // Para obter o valor, usamos os 'Getters'
    // Note que seu nome segue o mesmo padrão do 'Setter': 'pegar nome', por sua vez sem parâmetros e com retorno referente ao tipo de dado do atributo 'name', que é 'string'
    getName(): string {
        return this.name;
    };

    setAccountNumber(accountNumber: number): void {
        this.accountNumber = accountNumber;
    };

    getAccountNumber(): number {
        return this.accountNumber;
    };

    setBalance(balance: number): void {
        this.balance = balance;
    };

    getBalance(): number {
        return this.balance;
    };
};
```
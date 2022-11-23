# TypeScript

## Curso: Programação Orientada a Objetos com TypeScript

### Aula 02 - Classes e Tipos

```ts
// Abstração

class Account {
    name: string;
    accountNumber: number;

    constructor(name: string, accountNumber: number) {
        this.name = name;
        this.accountNumber = accountNumber;
    };

    deposit() {
        console.log("Você depositou");
    };

    withdraw() {
        console.log("Você sacou");
    };
}

// Note que, dessa vez, nós definimos o tipo da nossa variável. Essa é uma boa prática
const newAccount: Account = new Account("Gustavo", 1);

console.log(newAccount); // { name: 'Gustavo', accountNumber: 1 }
console.log(newAccount.deposit()); // "Você depositou"
console.log(newAccount.withdraw()); // "Você sacou"
```
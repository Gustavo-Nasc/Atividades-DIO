# TypeScript

## Curso: Programação Orientada a Objetos com TypeScript

### Aula 03 - Herança

#### Herança
Para praticar o conceito de herança, nós iremos reutilizar o código da aula anterior, adicionando um Admin
A classe 'Account' será a nossa 'Classe Pai'

```ts
// Herança

// 'Account' será a nossa classe Pai
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

class Admin extends Account {
    balance: number;

    constructor(name: string, accountNumber: number) {
        super(name, accountNumber); // Esses são atributos referentes a 'Classe Pai', que é a 'Account'
        this.balance = 20; // Já esse atributo é referente à 'Classe Filha', que é o Admin
    };

    getBalance() {
        console.log(this.balance);
    };
}


const adminAccount: Admin = new Admin("Admin", 2);
console.log(adminAccount);
```

#### Classe Abstrata
Classes abstratas são 'Classes de base' criadas para que outras classes sejam criadas.

Não se pode criar uma instância de uma classe Abstrata.

```ts
// Para criarmos classes abstratas, antes do operador 'class', nós inserimos a palavra reservada 'abstract':
abstract class FormaGeometrica {

}

class Quadrado extends FormaGeometrica {
    lado: number

    constructor(lado: number) {
        super()
        this.lado = lado;
    };
}
```
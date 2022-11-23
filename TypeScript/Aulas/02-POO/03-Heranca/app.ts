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

// Note que, dessa vez, nós definimos o tipo da nossa variável. Essa é uma boa prática
const newAccount: Account = new Account("Gustavo", 1);
console.log(newAccount); // { name: 'Gustavo', accountNumber: 1 }
newAccount.deposit(); // "Você depositou"
newAccount.withdraw(); // "Você sacou"


const adminAccount: Admin = new Admin("Admin", 2);
console.log(adminAccount);
export abstract class DioAccount {
    private name: string;
    private accountNumber: number;
    private balance: number = 0;

    // Método construtor com parâmetros
    constructor(name: string, accountNumber: number) {
        this.name = name;
        this.accountNumber = accountNumber;
    };

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

    deposit(): void {
        console.log("Você depositou!");
    };

    withdraw(): void {
        console.log("Você sacou");
    };


};
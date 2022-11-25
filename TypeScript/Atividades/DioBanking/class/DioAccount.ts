export abstract class DioAccount {
    private readonly name: string = "";
    private readonly accountNumber: number = 0;
    private balance: number;
    private status: boolean;

    constructor(name: string) {
        this.name = name;
        this.accountNumber = Math.floor(Math.random() * (99999 - 10000) + 10000); // É gerado um número aleatório para a conta
        this.balance = 0;
        this.status = true;
    };

    getName(): string {
        return this.name;
    };

    getAccountNumber(): number {
        return this.accountNumber;
    };

    protected setBalance(balance: number): void {
        this.balance = balance;
    };

    getBalance(): number {
        return this.balance;
    };

    setStatus(status: boolean): void {
        this.status = status;
    };

    getStatus(): string {
        if (this.status)
            return "Conta Ativada!"
        else
            return "Conta Desativada!"
    };

    deposit(value: number): void {
        if (this.validateStatus()) {
            this.balance += value;
            console.log(`R$ ${value} depositado com sucesso, seu saldo é de: R$ ${this.balance}`);
        } else {
            console.log("Conta inativa, reative a conta");
        }
    };

    withdraw(value: number): void {
        if (this.validateStatus()) {
            if (this.balance - value >= -2000) {
                this.balance -= value;
                console.log(`Você sacou R$ ${value}, seu novo saldo é de R$ ${this.balance}`);
            } else {
                console.log("Não foi possível sacar, limite atingido...");
            }
        } else {
            console.log("Conta inativa, reative a conta");
        }
    };

    protected validateStatus(): boolean {
        if (this.status)
            return this.status

        throw new Error("Conta inválida")
    };

    toString(): void {
        console.log(
            `
                Nome do Titular: ${this.name}\n
                Número da Conta: ${this.accountNumber}\n
                Saldo: R$ ${this.balance}\n
                Status: ${this.status}
            `
        )
    };

};
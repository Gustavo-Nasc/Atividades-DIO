import { DioAccount } from "./DioAccount";

export class CompanyAccount extends DioAccount {
    constructor(name: string) {
        super(name);
    };

    getLoan(value: number): void {
        if (this.validateStatus()) {
            const newBalance = this.getBalance() + value;

            this.setBalance(newBalance);

            console.log(`Você pegou um empréstimo de R$ ${value}, seu novo saldo é de ${this.getBalance()}`);
        } else {
            console.log("Conta inativa, reative a conta");
        }
    };
};
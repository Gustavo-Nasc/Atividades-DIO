import { PeopleAccount } from "./PeopleAccount";

export class PremiumAccount extends PeopleAccount {
    constructor(cod_id: number, name: string) {
        super(cod_id, name);
    }

    deposit(value: number): void {
        if (this.validateStatus()) {
            value += 10;

            const newBalance = this.getBalance() + value;

            this.setBalance(newBalance);

            this.setBalance(newBalance);
            console.log(
                `Conta PREMIUM identificada!\n
                ${value} depositado com sucesso, seu saldo é de: R$ ${this.getBalance()}`
            );
        } else {
            console.log("Conta inativa, reative a conta");
        }
    };
}
import { DioAccount } from "./DioAccount";

export class PeopleAccount extends DioAccount {
    private doc_id: number

    constructor(doc_id: number, name: string) {
        super(name);
        this.doc_id = doc_id;
    };

    getDoc_id(): number {
        return this.doc_id;
    }

    setDoc_id(doc_id: number): void {
        this.doc_id = doc_id;
    }

    toString(): void {
        console.log(`Nome do Titular: ${this.getName()}\nNúmero da Conta: ${this.getAccountNumber()}\nSaldo: R$ ${this.getBalance()}\nStatus: ${this.getStatus()}\nDoc ID: ${this.doc_id}`
        )
    }
};
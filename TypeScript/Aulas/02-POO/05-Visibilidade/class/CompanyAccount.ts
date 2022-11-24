import { DioAccount } from "./DioAccount";

export class CompanyAccount extends DioAccount {
    constructor(name: string, accountNumber: number) {
        super(name, accountNumber);
    };

    getLoan(): void {
        console.log("Você pegou um empréstimo");
    };

    // Estámos sobrescrevendo o Fluxo da execução do método 'deposit'. Isso ocorre pois a classe filha herda da classe pai os métodos e atributos, fazendo com que possamos sobrescrevê-los
    deposit(): void {
        console.log("A empresa depositou!");
    };
};
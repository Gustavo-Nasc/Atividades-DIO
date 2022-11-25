import readlineSync from 'readline-sync';
import { CompanyAccount } from './class/CompanyAccount';
import { PeopleAccount } from './class/PeopleAccount';
import { PremiumAccount } from './class/PremiumAccount';

let conditional: number;

do {
    console.log(`\nOlá! Bem vindo ao app DioBanking! O que deseja fazer hoje?\n\n1 - Criar uma nova Conta Pessoal\n2 - Criar uma nova Conta para Empresas\n\nSelecione uma das opções:`
    );
    conditional = parseInt(readlineSync.question());

    conditional !== 1 && conditional !== 2 ?
        console.log("\nOpção inválida, tente novamente")
        :
        console.log()
} while (conditional !== 1 && conditional !== 2);

// Caso seja Conta Pessoal
if (conditional === 1) {
    const nameAccount: string = readlineSync.question("Insira o Nome do Titular da Conta:");
    const doc_idAccound: number = parseInt(readlineSync.question("Insira o CPF do Titular da Conta:"));

    let peopleAccount: PeopleAccount | PremiumAccount = new PeopleAccount(doc_idAccound, nameAccount);

    do {
        console.log(`Seja bem vindo, ${nameAccount}! Selecione uma opção:\n\n1 - Sacar\n2 - Depositar\n3 - Visualizar seus dados\n4 - Desativar Conta\n5 - Ativar/Reativar Conta\n6 - Tornar-se Premium; 0 - Sair`);
        conditional = parseInt(readlineSync.question());

        if (conditional === 1) {
            const value: number = parseFloat(readlineSync.question("Insira o valor a ser sacado:"));
            peopleAccount.deposit(value);
        } else if (conditional === 2) {
            const value: number = parseFloat(readlineSync.question("Insira o valor a ser depositado:"));
            peopleAccount.deposit(value);
        } else if (conditional === 3) {
            peopleAccount.toString();
        } else if (conditional === 4) {
            peopleAccount.setStatus(false);
            peopleAccount.getStatus();
        } else if (conditional === 5) {
            peopleAccount.setStatus(true);
            peopleAccount.getStatus();
        } else if (conditional === 6) {
            let premiumAccount: PremiumAccount | PeopleAccount = new PremiumAccount(peopleAccount.getDoc_id(), peopleAccount.getName());

            premiumAccount = peopleAccount;

            peopleAccount = premiumAccount;
        } else if (conditional === 0) {
            console.log("Obrigado por utilizar!");
        } else {
            console.log("Opção inválida, tente novamente!");
        }
    } while (conditional !== 0);

} else if (conditional === 2) {
    const nameAccount: string = readlineSync.question("Insira o Nome do Empresa da Conta:");

    const companyAccount: CompanyAccount = new CompanyAccount(nameAccount);

    do {
        console.log(`Seja bem vindo, ${nameAccount}! Selecione uma opção:\n\n1 - Sacar\n2 - Depositar\n3 - Visualizar seus dados\n4 - Desativar Conta\n5 - Ativar/Reativar Conta\n6 - Realizar empréstimo\n0 - Sair`);
        conditional = parseInt(readlineSync.question());

        if (conditional === 1) {
            const value: number = parseFloat(readlineSync.question("Insira o valor a ser sacado:"));
            companyAccount.deposit(value);
        } else if (conditional === 2) {
            const value: number = parseFloat(readlineSync.question("Insira o valor a ser depositado:"));
            companyAccount.deposit(value);
        } else if (conditional === 3) {
            companyAccount.toString();
        } else if (conditional === 4) {
            companyAccount.setStatus(false);
            companyAccount.getStatus();
        } else if (conditional === 5) {
            companyAccount.setStatus(true);
            companyAccount.getStatus();
        } else if (conditional === 6) {
            const value: number = parseFloat(readlineSync.question("Insira o valor do empréstimo:"));
            companyAccount.getLoan(value);
        } else if (conditional === 0) {
            console.log("Obrigado por utilizar!");
        } else {
            console.log("Opção inválida, tente novamente!");
        }
    } while (conditional !== 0);
}
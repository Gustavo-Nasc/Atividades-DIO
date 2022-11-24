import { CompanyAccount } from "./class/CompanyAccount";
import { PeopleAccount } from "./class/PeopleAccount";

const peopleAccount: PeopleAccount = new PeopleAccount(1, "Gustavo", 10);
console.log(peopleAccount);
peopleAccount.deposit(); // "Você depositou!"

const companyAccount: CompanyAccount = new CompanyAccount("DIO", 20);
console.log(companyAccount);
companyAccount.deposit(); // "A empresa depositou!"
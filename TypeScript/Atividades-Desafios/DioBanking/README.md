# TypeScript

## Bootcamp: Formação TypeScript Fullstack Developer

### Atividade: Dio Bank

#### Desafios

- Implementar os métodos de depósito **(deposit)** e saque **(withdraw)** na classe [***DioAccount***](./class/DioAccount.ts)
   - Os valores dos saldos devem ser alterados, de acordo com o valor informado para depósito
   - Apenas contas com o status *true* e saldo **(balance)** maior que o valor solicitado podem fazer saques

- Implementar o método empréstimo **(getLoan)** na classe [***CompanyAccount***](./class/CompanyAccount.ts)
  - O saldo deve ser acrescido, de acordo com o valor informado para empréstimo
  - Apenas contas com o status true podem fazer empréstimo

- Criar um novo tipo de conta a partir da [***DioAccount***](./class/DioAccount.ts)
  - Esta conta não deve receber novos atributos
  - Esta conta terá um método de depósito, que aresce 10 a mais ao valor informado para depósito. (Ex: Um depósito de 100 será de 110 no final)

- Todos os atributos de qualquer conta devem ser privados

- Os atributos *name* e *accountNumber* não podem ser alterados internamente ou externamente

- Criar instâncias para cada um dos tipos de conta no [***app.ts***](./app.ts) e executar os métodos possíveis
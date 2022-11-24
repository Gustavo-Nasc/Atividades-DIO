# TypeScript

## Curso: Programação Orientada a Objetos com TypeScript

### Aula 06 - Readonly

#### Readonly
O operador 'readonly', assim como o 'private', é referente a vibilidade de atributos e métodos.

Ele pode ser utilizado combinado com o 'public' ou 'private'. Ele indica que o atributo pode ser apenas lido, não podendo ser alterado

Utilizando o código da aula anterior e adicionando um novo atributo, nós podemos exemplificar

```ts
// class/DioAccount.ts
export abstract class DioAccount {
    private readonly accountNumber: number;

    // Note que, quando colocamos um atributo como 'readonly', qualquer operação ou instanciação dele tornará a dar erro, pois ele é se tornou apenas de leitura
    // setAccountNumber(accountNumber: number): void {
    //     this.accountNumber = accountNumber;
    // };
}
```
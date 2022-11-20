# TypeScript

## Curso: Introdução a TypeScript

### Aula 05 - Fundamentos e Sintaxe (Estruturas de Repetição)

### Estruturas de Repetição

#### For
É o mais tradicional com TypeScript e JavaScript.

É possível declarar toda a estrutura de controle em um único lugar, ou seja, os três parâmetros (estado inicial, condicional e o incremento)

É mais utilizado em casos limitados, aonde sabemos o limite

```ts
for (let i = 0; i < 5; i++) {
    console.log(i);
}
```

---

#### Do-While e While
Antes, precisamos declarar a variável responsável pela contagem dos laços e dentro do laço, precisamos definir o incremental

Podem ser utilizados em situações na qual sabemos até quando um processo precisa ser realizado:
Quando depende da resposta de um usuário, por exemplo.

**A Grande diferença entre eles está na condicional:**

No 'while', a condição é executada primeiro, para, caso seja verdadeira, o processo ocorra.

Já no 'do-while', o bloco de comandos é executado primeiro e depois executado
```ts
// Laço 'while'
let j = 0;

while (j < 0) {
    j++;
}

console.log(j);
// Irá imprimir no console o número: 0
```

---

```ts
// Laço 'do-while'
let k = 0;

do {
    k++;
} while (k < 0);

console.log(k);
// Irá imprimir no console o número: 1
```
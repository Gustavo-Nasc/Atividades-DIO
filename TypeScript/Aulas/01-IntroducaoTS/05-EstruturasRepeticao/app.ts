// Estruturas de Repetição

// for
// É o mais tradicional com TypeScript e JavaScript.
// É possível declarar toda a estrutura de controle em um único lugar, ou seja, os três parâmetros (estado inicial, condicional e o incremento)
// É mais utilizado em casos limitados, aonde sabemos o limite
for (let i = 0; i < 5; i++) {
    console.log(i);
}


// while / do-while
// Possuem uma estrutura mais simples
// Antes, precisamos declarar a variável responsável pela contagem dos laços e dentro do laço, precisamos definir o incremental
// Podem ser utilizados em situações na qual sabemos até quando um processo precisa ser realizado:
// Quando depende da resposta de um usuário, por exemplo.

// A Grande diferença entre eles está na condicional:
// No 'while', a condição é executada primeiro, para, caso seja verdadeira, o processo ocorra.
// Já no 'do-while', o bloco de comandos é executado primeiro e depois executado

let j = 0;

while (j < 0) {
    j++;
}

console.log(j);

let k = 0;

do {
    k++;
} while (k < 0);

console.log(k);
# TypeScript

## Curso: Introdução a TypeScript

### Aula 05 - Fundamentos e Sintaxe (Manipulação de Arrays)

### Manipulação de Arrays
Funções para Arrays são consideradas manipulação de Arrays, como adicionar ou remover um elemento

Essas funções são nativas do próprio TypeScript


#### Push
Essa função adiciona um elemento ao nosso Array
```ts
const array: Array<number> = [1, 2, 3, 4];

console.log("Array original: ", array);

array.push(5); // Irá adicionar o elemento '5' ao Array

console.log("Array adicionando o elemento: ", array); // Irá imprimir todos os elementos e o número '5', que foi recém adicionado
```

---

#### Pop
Irá remover o último elemento do Array, ou seja, o da última posição
```ts
array.pop(); // Irá remover o último elemento do Array, no caso, o '5'

console.log("Array com o último valor inserido removido: ", array); // Irá imprimir o Array no estado original pois removemos o número '5'
```

---

#### Find
Com essa função, nós podemos procurar elementos dentro do nosso Array.

Recebe como parâmetro uma função de 'callback'
```ts
const buscaNumero4 = array.find(num => num > 2);
// Na linha acima, nós criamos uma constante que irá buscar os elementos, dentro do Array que sejam iguais a 4

console.log(buscaNumero4); // Irá imprimir o número '3', pois a função retorna um único elemento
// Caso nenhum valor seja encontrado, retornará 'undefined'
```

---

#### ForEach e Map
Essa é uma manipulação de Array com laços de repetição, é como se utilizássemos um laço 'for', porém, ele é bem mais simplificado:

Assim como o 'find', ele recebe uma função de 'callback'.

O 'forEach' e o 'map' possuem a mesmíssima sintaxe. A diferença entre eles é perfomática **(o map é mais perfomático)**. Como estamos trabalhando com códigos simples, não surte efeito

Além disso, uma outra boa diferença é que o 'map' pode trabalhar com funções assíncronas, funções que demandam um tempo de execução. Já o 'forEach' não permite tanto essa possibilidade
```ts
array.forEach(num => {
    console.log(num);
});

array.map(num => {
    console.log(num);
})

for (let i = 0; i < array.length; i++) {
    console.log(array[i]);
}

// As três maneiras executam a mesma coisa, a diferença entre elas está justamente na simplificação
```
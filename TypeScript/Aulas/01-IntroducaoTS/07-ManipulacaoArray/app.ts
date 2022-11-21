const array: Array<number> = [1, 2, 3, 4];

// Primeiro, vamos imprimir o array que criamos
console.log("Array original: ", array);


// PUSH
// Executamos uma operação, como por exemplo, adicionar um elemento
array.push(5); // Estamos adicionando o número 5 ao nosso Array

// E imprimimos novamente:
console.log("Array adicionando o elemento: ", array);


// POP
// Podemos também remover o último elemento adicionado, com a função 'pop'
// A função 'pop' remove o último elemento, por esse motivo, não passamos nada como seu parâmetro
array.pop();

// E então, imprimimos novamente
console.log("Array com o último valor inserido removido: ", array);


// FIND
const buscaNumeroMaior2 = array.find(num => num > 2);
// Na linha acima, nós criamos uma constante que irá buscar o primeiro elemento que seja maior do que 2
// Caso nenhum valor seja encontrado, retornará 'undefined'

console.log(buscaNumeroMaior2);


// FOREACH e MAP
// Essa é uma manipulação de Array com laços de repetição, é como se utilizássemos um laço 'for', porém, ele é bem mais simplificado
array.forEach(num => {
    console.log(num);
});

array.map(num => {
    console.log(num);
})

// Note que o 'forEach' e o 'map' possuem a mesmíssima sintaxe
// A diferença entre eles é perfomática. Como estamos trabalhando com códigos simples, não surte efeito
// Além disso, o 'map' pode trabalhar com funções assíncronas, funções que demandam um tempo de execução
// Já o 'forEach' não permite tanto essa possibilidade

for (let i = 0; i < array.length; i++) {
    console.log(array[i]);
}

// As três maneiras executam a mesma coisa, a diferença entre elas está justamente na simplificação
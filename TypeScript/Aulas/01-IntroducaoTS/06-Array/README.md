# TypeScript

## Curso: Introdução a TypeScript

### Aula 05 - Fundamentos e Sintaxe (Array)

### Array
Podemos criar vetores do tipo 'any', ou seja, poderá receber valores que qualquer tipo, porém, como visto anteriormente, é mais recomendado que utilizemos tipagem concreta


#### Declaração de Array
```ts
const arrayNumber: Array<number> = [1, 2, 3, 4, '5'];
// Se tentarmos adicionar uma String a ele, irá constar um erro no código, pois o tipo do nosso vetor é 'number'

const arrayString: Array<string> = ["a", "b", "c", "d", 5];
// O mesmo vale para vetores de outros tipos, como adicionar 'number' em um vetor de 'string'
```

Outra forma de instanciar um vetor é utilizando da Tipagem comum, sem a classe 'Array'
```ts
const arrayString: string[] = ["a", "b", "c", "d"];
```

---

#### Posição dos elementos

Vale lembrar que as posições (index) de um Array se iniciam na posição '0'. Por isso, caso eu queria acessar o primeiro elemento de um array, eu preciso passar a posição '0', conforme exemplo:
```ts
console.log(arrayNumber[0]); // Irá imprimir: 1
console.log(arrayString[0]); // Irá imprimir: 'a'
```

---

#### Funções em Arrays

As funções possíveis para Arrays são diversas, podem ser vistas em:
- [JavaScript Array Methods - W3Schools](https://www.w3schools.com/js/js_array_methods.asp)
- [Array - JavaScript - MDN Web Docs](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array)
// Arrays
// Note que instanciamos um vetor, o qual sua tipagem é a de Array do tipo (com o operador diamante '< >') number

// Podemos criar vetores do tipo 'any', ou seja, poderá receber valores que qualquer tipo, porém, como visto anteriormente, é mais recomendado
// que utilizemos tipagem concreta

// Se tentarmos adicionar uma String a ele, irá constar um erro no código
const arrayNumber: Array<number> = [1, 2, 3, 4 /*'5'*/];

// Outra forma de instanciar um vetor é utilizando da Tipagem comum, sem a classe 'Array'
const arrayString: string[] = ["a", "b", "c", "d" /*5*/];
// O mesmo vale para vetores de outros tipos, como adicionar 'number' em um vetor de 'string'

// Vale lembrar que as posições (index) de um Array se iniciam na posição '0'. Por isso, caso eu queria acessar o primeiro elemento de um array, eu preciso passar a posição '0', conforme exemplo:
console.log(arrayNumber[0]);
console.log(arrayString[0]);
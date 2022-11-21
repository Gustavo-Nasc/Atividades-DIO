// Sintaxe Básica do TypeScript

// Declaração de Variáveis

// Segue o mesmo padrão de variáveis do JavaScript
// Esta variável terá um escopo global, pode ser alterada em qualquer local de execução do Script
// Traz uma camada de segurança mas não é tão utilizada no mercado
var a = "a";

// A variável 'let' pode ser alterada ao longo do Script
let b = "b";
console.log(b);

b = "2";
console.log(b);

// A variável 'const', quando definida, não pode ser alterada, é imutável, não é possível sobrescrever
const c = "c";

// Caso haja alguma tentativa de alteração, o própior TypeScript informa que não é possível alterar a variável, pois ela é uma constante
// c = "3"; -- Descomente essa linha para visualizar o erro


// Tipos Primitivos do TypeScript
// Na sintaxe do TypeScript, é comum passarmos o tipo de dado que ele receberá
let stringPrimitivo: string = "stringPrimitivo"
let numeroPrimitivo: number = 2;
let booleanPrimitivo: boolean = true;

// Também é possível definir mais de um tipo primitivo a uma variável
// Não é ideal, pois quando atribuímos mais de um tipo a uma variável, estamos voltando para a Tipagem do JavaScript, como se a variável fosse 'any', ou seja, de qualquer tipo
let nTiposPrimitos: string | number = 2;
nTiposPrimitos = "2";
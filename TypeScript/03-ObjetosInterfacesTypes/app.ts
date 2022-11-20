// Objetos em TypeScript

// Note que, na tipagem comum do JavaScript, nós criamos um Objeto com um tipo de variável
const pessoa1 = {
    nome: "Gustavo",
    idade: 18
}

// Já no TypeScript, há duas formas de criar um objeto:

// Interface
// As interfaces são abertas, ou seja, podemos extende-la declarando novamente
interface InterfacePessoa {
    nome: string,
    idade: number,
    profissao?: string // Atributo Opcional com '?'
}

// Descomente a linha abaixo e note o código não irá dar erro, pois a 'interface' pode ser redeclarada
// interface Pessoa {
//     nome: string,
//     idade: number,
//     profissao?: string // Atributo Opcional com '?'
// }

// E então, instanciamos um Objeto
const pessoa2: InterfacePessoa = {
    nome: "Gustavo",
    idade: 18
}

// 'Pessoa' com o campo adicional inserido
const pessoa3: InterfacePessoa = {
    nome: "Cláudio",
    idade: 45,
    profissao: "Engenheiro de Software"
}

// Array do tipo Objeto de Pessoas
const arrayPessoas1: InterfacePessoa[] | TypePessoa[] = [
    pessoa2,
    pessoa3
]

// ou

const arrayPessoas2: Array<InterfacePessoa> | Array<TypePessoa> = [
    pessoa2,
    pessoa3
]

// As duas formas acima são válidas para Declarações de Array




// Type
// Os types são restriros, ou seja, não podemos redeclará-los
type TypePessoa = {
    nome: string,
    idade: number,
    profissao?: string // Atributo Opcional com '?'
}

// Descomente a linha abaixo e note o código irá dar erro, pois o 'type' não pode ser redeclarado
// type TypePessoa = {
//     nome: string,
//     idade: number,
//     profissao?: string // Atributo Opcional com '?'
// }
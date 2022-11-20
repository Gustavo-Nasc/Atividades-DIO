# TypeScript

## Curso: Introdução a TypeScript

### Aula 03 - Fundamentos e Sintaxe (Objetos e Interafaces)

### Interface
As interfaces são abertas, ou seja, podemos extendê-la declarando novamente

```ts
interface InterfacePessoa {
    nome: string,
    idade: number,
    profissao?: string // Atributo Opcional com '?'
}
```

---

### Type
```ts
type TypePessoa = {
    nome: string,
    idade: number,
    profissao?: string // Atributo Opcional com '?'
}
```

### Array
A mesma tipagem abaixo serve para demais tipos de dados, como 'string' ou 'number'
```ts
const arrayPessoas1: InterfacePessoa[] | TypePessoa[] = [
    pessoa2,
    pessoa3
]
// ou
const arrayPessoas2: Array<InterfacePessoa> | Array<TypePessoa> = [
    pessoa2,
    pessoa3
]
```
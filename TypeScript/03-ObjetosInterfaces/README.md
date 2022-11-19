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
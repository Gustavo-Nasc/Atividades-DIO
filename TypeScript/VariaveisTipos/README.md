# TypeScript

## Curso: Introdução a TypeScrip

### Aula 02 - Fundamentos e Sintaxe (Variáveis e tipos)

### Variáveis de escopo
Segue o mesmo padrão de variáveis do JavaScript.

#### Var
Esta variável terá um escopo global, pode ser alterada em qualquer local de execução do Script.

Traz uma camada de segurança mas não é tão utilizada no mercado.

#### Let
A variável 'let' pode ser alterada ao longo do Script.

#### Const
A variável 'const', quando definida, não pode ser alterada, é imutável, não é possível sobrescrever.

Caso haja alguma tentativa de alteração, o própior TypeScript informa que não é possível alterar a variável, pois ela é uma constante.

---

### Tipos Primitivos

#### String
```ts
let stringPrimitivo: string = "stringPrimitivo"
```

#### Number
```ts
let numeroPrimitivo: number = 2;
```

#### Boolean
```ts
let booleanPrimitivo: boolean = true;
```
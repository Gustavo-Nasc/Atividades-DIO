# TypeScript

## Curso: Programação Orientada a Objetos com TypeScript

### Aula 01 - O que é POO
É um paradigma de programação baseado no conceitos de objetos, que podem conter dados (atributos) e procedimentos (métodos)

```ts
const user = {
    name: 'Gustavo',
    age: 18,
    // Podemos também inserir funções (métodos) aos nossos Objetos
    showName() {
        console.log(this.name) // O Operador 'this' indica, referencia ao Objeto no qual estamos manipulando
    }
};

// Nós podemos acessar e visualizar esse objeto
// Serão impressos as informações desse objeto
console.log(user); // { name: 'Gustavo', age: 18, [Function: showName] }

// Podemos também visualizar apenas um dos campos, separadamente
console.log(user.name); // "Gustavo"
// ou
user.showName();

console.log(user.age); // 18
```

Porém, note que, para cada objeto que instanciarmos, precisariamos criar variáveis que iriam receber valores diferentes. Para contornar isso, nós criamos classes

```ts
class User {
    // Atributos da Classe
    name: string = ""
    age: number = 0;

    // Método Construtor com parâmetros
    constructor(name: string, age: number) {
        this.name = name;
        this.age = age;
    }

    // Métodos de Acesso (Getters e Setters)
    getName() {
        return this.name;
    }

    getAge() {
        return this.age;
    }
}

// Agora, com a classe User criada, nós podemos instanciar um objeto a partir dela
const user = new User("Gustavo", 18);
console.log(user.getName());
```
// Programação Orientada a Objetos

// É um paradigma de programação baseado no conceitos de objetos, que podem conter dados (atributos) e procedimentos (métodos)

// No primeiro módulo, nós vimos a respeito de objetos
const userDefault = {
    name: 'Gustavo',
    age: 18,
    // Podemos também inserir funções (métodos) aos nossos Objetos
    showName() {
        console.log(this.name) // O Operador 'this' indica, referencia ao Objeto no qual estamos manipulando
    }
};

// Nós podemos acessar e visualizar esse objeto
// Serão impressos as informações desse objeto, no caso: 'name' e 'age'
console.log(userDefault); // { name: 'Gustavo', age: 18 }

// Podemos também visualizar apenas um dos campos, separadamente
console.log(userDefault.name); // "Gustavo"
// ou
userDefault.showName();

console.log(userDefault.age); // 18

// Porém, note que, para cada objeto que instanciarmos, precisariamos criar variáveis que iriam receber valores diferentes. Para contornar isso, nós criamos classes
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
// Estruturas de Decisão
const numero: number = 15;

// A estrutura de decisão do TypeScript é idêntica
if (numero > 15) {
    console.log("Número maior que 15");
} else if (numero === 15) {
    console.log("Número igual a 15")
} else {
    console.log("Número menor que 15");
}

numero > 15 ?
    console.log("Número maior que 15")
    : numero === 15 ?
        console.log("Número igual a 15")
        :
        console.log("Número menor que 15");

// Objetos Literais
// Todo objeto no TypeScript é um Objeto Literal
// É possível utilizar o Objeto Literal para construir uma Estrutura de Decisão baseada em uma função

// Imaginemos o seguinte exemplo:
// O Usuário fez login na aplicação, e, esse usuário, de acordo com o que ele seja (Visitante, Estudante ou ADM), uma mensagem diferente apareça
// Podemos utilizar o "if-else", porém, podemos utilizar um Objeto Literal dentro de uma simples função para melhorar a forma como nos lidamos com um Objeto Literal

const TypeUser = {
    admin: "Seja bem vindo, Admin!",
    student: "Você é um Estudante",
    viewer: "Você pode Visualizar"
}

function validateUser(user: string) {
    console.log(TypeUser[user as keyof typeof TypeUser]); // Utilizamos o operador do TypeScript 'as keyof typeof' para indicar que o parâmetro passado como 'string' é uma chave do tipo 'TypeUser'
}

const user = "admin";

validateUser(user);
validateUser('student');
validateUser('viewer');
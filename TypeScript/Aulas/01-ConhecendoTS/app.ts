const soma = (a: number, b: number) => {
    console.log(a + b);
};

soma(2, 2);
// soma("Gustavo", "Nascimento");
// Ao descomentar a linha acima, você verá que ele irá apontar o erro, pois foi definido lá em cima que ambos os parâmetros seriam do tipo numérico

// Para que esse arquivo possa ser executado, é necessário que ele seja "transpilado", ou seja, transformado em um arquivo JS
// Para transformar o arquivo TS em JS, passamos no terminal:
// npm tsc app.ts
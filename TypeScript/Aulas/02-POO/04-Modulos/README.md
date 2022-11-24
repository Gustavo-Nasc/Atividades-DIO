# TypeScript

## Curso: Programação Orientada a Objetos com TypeScript

### Aula 04 - Módulos

#### Módulos
Nós podemos criar nossas Classes separadamente, de forma que o código fique mais organizado e limpo

Para exportar Classes, basta, antes da declaração de uma Classe, passar a palavra reservada 'export' e no arquivo que deseja importar, basta passar o mesmo nome da Classe
```ts
// class/DioAccount.ts
export abstract class DioAccount {
    
};

// app.ts
import { DioAccount } from "./class/DioAccount"
```
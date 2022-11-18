# TypeScript

## Iniciando um projeto em TypeScript

```bash
# Iniciando um novo projeto Node.js
npm init -y

# Instalando as dependências de Desenvolvimento em TS
npm install -D typescript ts-node-dev

# Iniciando o projeto em TS, gerand o 'tsconfig.json'
npx tsc --init

# Transformando arquivos TS em JS, de maneira nativa
npx tsc nomeArquivo.ts

# Executar um arquivo TS sem a necessidade de transformá-lo
npx ts-node-dev nomeArquivo.ts
# Ou criar um Script de desenvolvimento no 'package.json'
npm run dev
```
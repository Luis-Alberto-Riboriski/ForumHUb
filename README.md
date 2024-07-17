## Sobre o Projeto

O FórumHub é um desafio proposto para aprimorar habilidades em desenvolvimento back-end Java com Spring Boot. Inspirado no fórum da Alura, onde alunos e instrutores interagem, este projeto visa replicar a lógica de backend de um fórum, destacando a relação entre tópicos, respostas e usuários.

### Objetivo

Criar uma API REST que permita:

 Aos usuários: 
- Criarem novos tópicos.
- Listar todos os tópicos existentes
- Detalhar um tópico específico.
- Atualizar um tópico.
- Excluir um tópico.
- Validação de Tópicos Duplicados.
- Verificação de ID.

Este projeto não só oferece uma compreensão aprofundada do CRUD, mas também explora a utilização de frameworks e ferramentas que facilitam o desenvolvimento e manutenção de aplicações robustas.

## Autenticação e Segurança

Para acessar as funcionalidades da API, os usuários precisam se autenticar utilizando tokens JWT. O processo é o seguinte:

1. Acessar a rota `http://localhost:8080/login` para obter um token JWT.
2. Incluir este token no cabeçalho de autorização de todas as requisições subsequentes.
3. Utilizar uma biblioteca como JWT.io para gerenciar os tokens na aplicação cliente.

## Documentação e Funcionalidades Opcionais

A API inclui documentação detalhada que pode ser acessada via Trello - ForumHub. Além das funcionalidades básicas, existem opções para:

- **Gerenciamento de Usuários e Respostas**: Implementação de rotas adicionais como `/usuario` e `/respostas`.
- **Swagger**: Documentação interativa da API para facilitar a exploração e teste das funcionalidades.

## Tecnologias Utilizadas

O desenvolvimento da API envolveu diversas tecnologias modernas, incluindo:

- **Java 17**: Linguagem de programação principal.
- **Spring Boot 3**: Framework que facilita a criação de aplicações Java.
- **Spring Security**: Implementação de segurança.
- **JWT (JSON Web Token)**: Gerenciamento de tokens para autenticação.
- **Maven**: Ferramenta de automação de compilação.
- **MySQL**: Sistema de gerenciamento de banco de dados.
- **Hibernate**: Framework de mapeamento objeto-relacional.
- **Flyway**: Ferramenta para migração de banco de dados.
- **Lombok**: Biblioteca para reduzir a verbosidade do código Java.



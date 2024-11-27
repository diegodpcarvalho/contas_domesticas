💳 Sistema de Gestão de Contas e Compras com Spring Boot
Este é um sistema desenvolvido para gerenciar contas a pagar, contas a receber e compras com cartão de crédito. O projeto foi construído utilizando o padrão MVC (Model-View-Controller) com Spring Boot e integra tecnologias modernas para persistência de dados, controle de versões de banco de dados e uma interface amigável para os usuários.

✨ Funcionalidades
Cadastro e gerenciamento de contas a pagar e contas a receber.
Registro de compras com cartão de crédito, incluindo controle de parcelas e limite disponível.
Resumo financeiro com tabelas dinâmicas para acompanhamento.
Mecanismo para marcar contas como pagas ou recebidas.
Controle de versões do banco de dados com Flyway.
🛠️ Tecnologias Utilizadas
Java com Spring Boot
PostgreSQL para banco de dados
JPA/Hibernate para persistência
Flyway para migrations do banco de dados
HTML, CSS e Bootstrap para o front-end
JavaScript para chamadas à API (Fetch API)
🚀 Como Configurar e Executar
Pré-requisitos
Java 17 ou superior
PostgreSQL instalado e configurado
Maven para gerenciamento de dependências
Git para clonar o repositório
Passos
Clone o repositório:

bash
Copiar código
git clone https://github.com/seu-usuario/gestao_contas_domesticas.git
cd gestao_contas_domesticas
Configure o banco de dados:

Crie um banco de dados no PostgreSQL chamado gestao_contas.
Atualize o arquivo application.properties em src/main/resources com suas credenciais:
properties
Copiar código
spring.datasource.url=jdbc:postgresql://localhost:5432/gestao_contas
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
Compile e execute o projeto:

Compile:
bash
Copiar código
./mvnw clean install
Execute:
bash
Copiar código
./mvnw spring-boot:run
Acesse a aplicação:

Abra no navegador: http://localhost:8080/login.html
🔐 Melhorias Planejadas
Criptografia de Senhas: Substituir o envio de senhas em texto plano por hash com salt (e.g., BCrypt).
Autenticação Segura: Implementar JWT para autenticação e eliminação do uso do localStorage para armazenar IDs de usuários.
Proteção contra SQL Injection: Garantir o uso de parâmetros preparados em todas as queries.
HTTPS: Configurar comunicação segura para evitar ataques do tipo Man in the Middle.
🤝 Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e enviar pull requests para melhorar este projeto.

📜 Licença
Este projeto está sob a licença MIT.

CREATE TABLE usuarios (
                          id SERIAL PRIMARY KEY,
                          nome VARCHAR(100) NOT NULL,
                          email VARCHAR(100) NOT NULL UNIQUE,
                          senha_hash TEXT NOT NULL,
                          criado_em TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE compras_cartao (
                                id SERIAL PRIMARY KEY,
                                usuario_id INT NOT NULL,
                                descricao VARCHAR(255) NOT NULL,
                                valor DECIMAL(10, 2) NOT NULL,
                                data_compra DATE NOT NULL,
                                categoria VARCHAR(50) NOT NULL,
                                cartao_utilizado VARCHAR(50) NOT NULL,
                                parcelas INT DEFAULT 1,
                                limite_atual DECIMAL(10, 2),
                                criado_em TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                                FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
);

CREATE TABLE contas_pagar (
                              id SERIAL PRIMARY KEY,
                              usuario_id INT NOT NULL,
                              descricao VARCHAR(255) NOT NULL,
                              valor DECIMAL(10, 2) NOT NULL,
                              data_vencimento DATE NOT NULL,
                              status VARCHAR(20) NOT NULL DEFAULT 'pendente',
                              categoria VARCHAR(50) NOT NULL,
                              criado_em TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                              FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
);

CREATE TABLE contas_receber (
                                id SERIAL PRIMARY KEY,
                                usuario_id INT NOT NULL,
                                descricao VARCHAR(255) NOT NULL,
                                valor DECIMAL(10, 2) NOT NULL,
                                data_recebimento DATE NOT NULL,
                                status VARCHAR(20) NOT NULL DEFAULT 'pendente',
                                categoria VARCHAR(50) NOT NULL,
                                criado_em TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                                FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
);
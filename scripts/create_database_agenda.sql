CREATE DATABASE db_agenda;

USE db_agenda;

CREATE TABLE tb_usuario (
	id INT PRIMARY KEY AUTO_INCREMENT,
    nome varchar(40) NOT NULL,
    usuario VARCHAR(10) NOT NULL,
    senha VARCHAR(20) NOT NULL
);

INSERT INTO tb_usuario(nome, usuario, senha) VALUES('Administrador', 'admin', '12345');
INSERT INTO tb_usuario(nome, usuario, senha) VALUES('Convidado', 'convidado', '12345');
INSERT INTO tb_usuario(nome, usuario, senha) VALUES('Estagiário', 'estag', '12345');

SELECT * FROM tb_usuario;
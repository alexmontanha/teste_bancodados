# Teste de Banco de dados

## Descrição do Projeto

Esse projeto tem por finalidade, apresentar a estudantes de desenvolvimento de software, como funciona um banco de dados relacional, e como é feito a conexão com o banco de dados, utilizando a linguagem de programação Java.

## Tecnologias utilizadas

- Java
- MySQL
- JDBC

## Como instalar a biblioteca JDBC para MySQL

1. Baixe o arquivo .jar do MySQL Connector/J no site da Oracle: https://dev.mysql.com/downloads/connector/j/
2. Descompacte o arquivo .zip
3. Copie o arquivo .jar para a pasta lib do seu projeto
4. No Eclipse, clique com o botão direito no projeto, vá em Build Path e clique em Configure Build Path
5. Na aba Libraries, clique em Add JARs
6. Selecione o arquivo .jar que você copiou para a pasta lib do seu projeto e clique em Apply and Close

## Como criar o banco de dados

```sql
-- Exemplo de Script de MySQL (DML)

-- Abrindo o banco

use aula_seg;

-- Criando uma nova tabela

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

CREATE TABLE IF NOT EXISTS `aula_seg`.`Clientes` (
  `Id` INT NOT NULL AUTO_INCREMENT,
  `Nome` VARCHAR(250) NULL,
  `Endereco` VARCHAR(500) NULL,
  `cep` VARCHAR(10) NULL,
  `Limite_Credito` DECIMAL(10,2) NULL,
  PRIMARY KEY (`Id`))
ENGINE = InnoDB;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

````

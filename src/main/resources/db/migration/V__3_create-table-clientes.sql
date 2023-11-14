CREATE TABLE CLIENTES(
    id NUMBER GENERATED ALWAYS AS IDENTITY (START WITH 1 INCREMENT BY 1) PRIMARY KEY,
    cpf CHAR(14) constraint cpf_nn not null,
    nome VARCHAR(30) constraint nm_nn not null,
    sobrenome VARCHAR(30) constraint sbn_nn not null,
    rg CHAR(12)constraint rg_uk unique,
    email VARCHAR(30) constraint email_nn not null,
    telefone_residencial NUMBER(8) constraint tel_res_nn not null,
    telefone_celular NUMBER(11) constraint tel_cel_nn not null,
    data_nascimento DATE constraint dt_nn not null,
    genero VARCHAR(10) constraint gen_nn not null,
    logradouro varchar(100) not null,
    bairro varchar(100) not null,
    cep varchar(9) not null,
    complemento varchar(100),
    numero varchar(20),
    uf char(2) not null,
    cidade varchar(100) not null
)

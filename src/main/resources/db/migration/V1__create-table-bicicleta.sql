CREATE TABLE bicicletas(
    id NUMBER GENERATED ALWAYS AS IDENTITY (START WITH 1 INCREMENT BY 1) PRIMARY KEY,
    numero_de_serie VARCHAR(10) constraint nmr_pk not null,
    marca VARCHAR(30) constraint marca_nn not null,
    modelo VARCHAR(30) constraint mod_nn not null,
    tipo_bike VARCHAR(20) constraint tp_nn not null,
    cor VARCHAR(25) constraint cor_nn not null,
    tipo_de_freio VARCHAR(20) constraint freio_nn not null,
    tipo_de_suspensao VARCHAR(30) constraint susp_nn not null,
    marchas NUMBER(2) constraint mar_nn not null,
    aro NUMBER(2) constraint aro_nn not null,
    item_personalizado VARCHAR(30) constraint it_nn not null,
    fk_cliente_cpf_clie CHAR(11) constraint clie_bike_fk references cliente
);
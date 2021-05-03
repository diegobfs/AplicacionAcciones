# AplicacionAcciones
Aplicacion sobre compra y venta de acciones y de criptomonedas en java


Scripts de la bases de datos:
--Usuarios
CREATE TABLE public.usuarios
(
    id_usuario character varying(20) COLLATE pg_catalog."default" NOT NULL,
    contrasena character varying(20) COLLATE pg_catalog."default" NOT NULL,
    fondos real NOT NULL,
    tipo_usuario character varying(15) COLLATE pg_catalog."default" NOT NULL,
    enespera integer NOT NULL,
    CONSTRAINT usuario_pkey PRIMARY KEY (id_usuario),
    CONSTRAINT usuario FOREIGN KEY (id_usuario)
        REFERENCES public.usuarios (id_usuario) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE RESTRICT
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;


--Inversores
CREATE TABLE public.inversores
(
    idusuario character varying(20) COLLATE pg_catalog."default" NOT NULL,
    dni character varying(9) COLLATE pg_catalog."default" NOT NULL,
    nombre character varying(15) COLLATE pg_catalog."default" NOT NULL,
    apellido1 character varying(15) COLLATE pg_catalog."default" NOT NULL,
    apellido2 character varying(15) COLLATE pg_catalog."default" NOT NULL,
    calle character varying(20) COLLATE pg_catalog."default" NOT NULL,
    portal integer NOT NULL,
    piso integer NOT NULL,
    puerta character varying(2) COLLATE pg_catalog."default" NOT NULL,
    telefono integer NOT NULL,
    CONSTRAINT inversores_pkey PRIMARY KEY (idusuario, dni),
    CONSTRAINT "idUsuario" FOREIGN KEY (idusuario)
        REFERENCES public.usuarios (id_usuario) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE RESTRICT
        NOT VALID
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

--Empresas
CREATE TABLE public.empresas
(
    idusuario character varying(20) COLLATE pg_catalog."default" NOT NULL,
    cif character varying(9) COLLATE pg_catalog."default" NOT NULL,
    nombrecomercial character varying(20) COLLATE pg_catalog."default" NOT NULL,
    ciudad character varying(15) COLLATE pg_catalog."default" NOT NULL,
    calle character varying(50) COLLATE pg_catalog."default" NOT NULL,
    numero integer NOT NULL,
    telefono integer NOT NULL,
    participaciones integer NOT NULL,
    participacionessinvender integer NOT NULL,
    dinerobloqueado real NOT NULL,
    CONSTRAINT empresas_pkey PRIMARY KEY (idusuario, cif),
    CONSTRAINT idusuario FOREIGN KEY (idusuario)
        REFERENCES public.usuarios (id_usuario) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE RESTRICT
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;


--hacerofertaventa
CREATE TABLE public.hacerofertaventa
(
    fechaoferta timestamp without time zone NOT NULL,
    precio real NOT NULL,
    numparticipaciones integer NOT NULL,
    disponibilidad boolean NOT NULL,
    empresa character varying(9) COLLATE pg_catalog."default" NOT NULL,
    idempresa character varying(20) COLLATE pg_catalog."default" NOT NULL,
    idusuario character varying(20) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT hacerofertaventa_pkey PRIMARY KEY (fechaoferta, empresa, idempresa, idusuario),
    CONSTRAINT empresas FOREIGN KEY (empresa, idempresa)
        REFERENCES public.empresas (cif, idusuario) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE RESTRICT,
    CONSTRAINT idusuario FOREIGN KEY (idusuario)
        REFERENCES public.usuarios (id_usuario) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE RESTRICT
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

--Poseer
CREATE TABLE public.poseer
(
    empresa character varying(9) COLLATE pg_catalog."default" NOT NULL,
    idempresa character varying(20) COLLATE pg_catalog."default" NOT NULL,
    idusuario character varying(20) COLLATE pg_catalog."default" NOT NULL,
    fecha timestamp without time zone NOT NULL,
    cantidad integer NOT NULL,
    CONSTRAINT poseer_pkey PRIMARY KEY (empresa, idempresa, idusuario, fecha),
    CONSTRAINT empresa FOREIGN KEY (empresa, idempresa)
        REFERENCES public.empresas (cif, idusuario) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE RESTRICT,
    CONSTRAINT idusuario FOREIGN KEY (idusuario)
        REFERENCES public.usuarios (id_usuario) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE RESTRICT
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

--compraventa
CREATE TABLE public.compraventa
(
    idusuariovendedor character varying(20) COLLATE pg_catalog."default" NOT NULL,
    idusuariocomprador character varying(20) COLLATE pg_catalog."default" NOT NULL,
    empresa character varying(9) COLLATE pg_catalog."default" NOT NULL,
    idempresa character varying(20) COLLATE pg_catalog."default" NOT NULL,
    fechacompra timestamp without time zone NOT NULL,
    numeroparticipaciones integer NOT NULL,
    comision real NOT NULL,
    CONSTRAINT compraventa_pkey PRIMARY KEY (idusuariovendedor, idusuariocomprador, empresa, idempresa, fechacompra),
    CONSTRAINT empresa FOREIGN KEY (empresa, idempresa)
        REFERENCES public.empresas (cif, idusuario) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE RESTRICT,
    CONSTRAINT idusuariocompr FOREIGN KEY (idusuariocomprador)
        REFERENCES public.usuarios (id_usuario) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE RESTRICT,
    CONSTRAINT idusuariovend FOREIGN KEY (idusuariovendedor)
        REFERENCES public.usuarios (id_usuario) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE RESTRICT
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

--pagosdividendo
CREATE TABLE public.pagosdividendos
(
    empresa character varying(9) COLLATE pg_catalog."default" NOT NULL,
    idempresa character varying(20) COLLATE pg_catalog."default" NOT NULL,
    fechapago timestamp without time zone NOT NULL,
    beneficio real NOT NULL,
    CONSTRAINT pagosdividendos_pkey PRIMARY KEY (empresa, idempresa, fechapago),
    CONSTRAINT empresa FOREIGN KEY (empresa, idempresa)
        REFERENCES public.empresas (cif, idusuario) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE RESTRICT
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

--Anuncios
CREATE TABLE public.anuncios
(
    idanuncio integer NOT NULL,
    informacion character varying(100) COLLATE pg_catalog."default" NOT NULL,
    fechapubli timestamp without time zone NOT NULL,
    fechapago timestamp without time zone NOT NULL,
    empresa character varying(9) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT anuncios_pkey PRIMARY KEY (idanuncio)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

--TablaActualizacionesPrecios
CREATE TABLE public.tablaactualizacionesprecios
(
    nombrecripto character varying(20) COLLATE pg_catalog."default" NOT NULL,
    precio real NOT NULL,
    CONSTRAINT "Tablaactualizacionesprecios_pkey" PRIMARY KEY (nombrecripto)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

--Monederos

CREATE TABLE public.monederos
(
    id_usuario character varying(20) COLLATE pg_catalog."default" NOT NULL,
    tipo character varying(20) COLLATE pg_catalog."default" NOT NULL,
    cantidad real NOT NULL,
    CONSTRAINT monederos_pkey PRIMARY KEY (id_usuario, tipo),
    CONSTRAINT id_usuario FOREIGN KEY (id_usuario)
        REFERENCES public.usuarios (id_usuario) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE RESTRICT
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;


--CompraVentaCriptos
CREATE TABLE public.compraventacriptos
(
    idcomprador character varying(20) COLLATE pg_catalog."default" NOT NULL,
    idvendedor character varying(20) COLLATE pg_catalog."default" NOT NULL,
    tipo character varying(20) COLLATE pg_catalog."default" NOT NULL,
    fechacompra timestamp without time zone NOT NULL,
    cantidad real NOT NULL,
    precio real NOT NULL,
    CONSTRAINT compraventacriptos_pkey PRIMARY KEY (idcomprador, idvendedor, tipo, fechacompra),
    CONSTRAINT "idComprador" FOREIGN KEY (idcomprador, tipo)
        REFERENCES public.monederos (id_usuario, tipo) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE RESTRICT,
    CONSTRAINT "idVendedor" FOREIGN KEY (idcomprador, tipo)
        REFERENCES public.monederos (id_usuario, tipo) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE RESTRICT
        NOT VALID
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

--HacerOfertaVentaCripto
CREATE TABLE public.hacerofertaventacripto
(
    fechaoferta timestamp without time zone NOT NULL,
    cantidad real NOT NULL,
    tipo character varying(20) COLLATE pg_catalog."default" NOT NULL,
    idusuario character varying(20) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT hacerofertaventacripto_pkey PRIMARY KEY (fechaoferta, idusuario, tipo),
    CONSTRAINT usuario FOREIGN KEY (idusuario, tipo)
        REFERENCES public.monederos (id_usuario, tipo) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE RESTRICT
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;


Ejemplo de insercción de datos:

-- USUARIOS
--contrasenas sin encriptar comentadas, necesarias para iniciar sesión
insert into usuarios values ('Inditex','326212', 90000, 'empresas', 0); --1234
insert into usuarios values ('Repsol','326212', 10000, 'empresas', 0); --1234
insert into usuarios values ('Citroen','a3f38506', 80000, 'empresas', 0); --555a
insert into usuarios values ('a','a3f97', 80000, 'empresas', 1); --a
insert into usuarios values ('Diego','326212', 1000000, 'inversores', 0); --1234
insert into usuarios values ('Alex','a3f25186', 1000, 'inversores', 0); --1111
insert into usuarios values ('Oscar','a3f25700', 100, 'inversores', 1); --2222
insert into usuarios values ('b','a3f98', 100000, 'inversores', 1); --b
insert into usuarios values ('0','a3f48',1000000, 'regulador', 0);--0
insert into usuarios values ('anaca', 'a3f53795', 10000, 'inversores', 0); --anaca

-- EMPRESAS
insert into empresas values ('Inditex', '44378195K', 'Inditex', 'Madrid', 'Neptuno', 1, 687450436, 0, 3000, 0);
insert into empresas values ('Repsol','54358695J','Repsol', 'Barcelona', 'Ramblas', 2, 676502348, 0, 2500, 0);
insert into empresas values ('Citroen','65781243H','Citroen', 'Vigo','Balaidos', 3, 987912412, 10, 1000, 0);
insert into empresas values ('a','98456321G','a', 'milladoiro', 'Rep Argentina', 4, 536789654, 0, 4000, 0);

-- INVERSORES
insert into inversores values ('Diego','52184051J','Diego', 'Cacheiro', 'Perez', 'Neptuno', 124, 6, 'D', 674680404);
insert into inversores values ('Alex','54358695J','Alex', 'Baquero', 'Dominguez', 'Ramblas', 23, 5, 'G', 687549800);
insert into inversores values ('Oscar','65781243H','Oscar', 'Aldrey', 'Blanco','Balaidos', 33, 4, 'B', 677254687);
insert into inversores values ('b','98456321G','b', 'b', 'b','milladoiro', 45, 1, 'A', 536789654);

--hacerOfertaVenta
insert into hacerofertaventa values ('2021/04/19 12:00:00','50',100, true, '44378195K', 'Inditex', 'Oscar');
insert into hacerofertaventa values ('2021/04/19 00:00:00','50',100, false, '65781243H', 'Citroen', 'Diego');
insert into hacerofertaventa values ('2021/04/19 13:00:00','50',100, true, '54358695J', 'Repsol', 'Alex');

--Poseer
insert into poseer values ('44378195K', 'Inditex', 'Oscar', '2021/04/07 14:00:00', 100);
insert into poseer values ('54358695J', 'Repsol', 'Alex', '2021/04/10 20:00:00', 100);
insert into poseer values ('65781243H', 'Citroen', 'Diego', '2021/04/13 04:00:00', 100);

--Compraventa
insert into compraventa values ( 'Inditex', 'Oscar', '44378195K', 'Inditex', '2021/04/07 14:00:00', 100, 500);
insert into compraventa values ( 'Repsol', 'Alex', '54358695J', 'Repsol', '2021/04/10 20:00:00', 100, 500);
insert into compraventa values ( 'Citroen', 'Diego', '65781243H', 'Citroen', '2021/04/13 04:00:00', 100, 500);

--PagosDividendo
insert into pagosdividendos values ( '44378195K', 'Inditex', '2021/04/07 14:00:00', 1000);
insert into pagosdividendos values ( '54358695J', 'Repsol', '2021/04/10 20:00:00', 1000);
insert into pagosdividendos values ( '65781243H', 'Citroen', '2021/04/13 04:00:00', 1000);

--Anuncios
insert into anuncios values (1,'Pago de Oscar a Inditex', '2021/04/19 12:00:00', '2021/04/07 14:00:00', '44378195K');
insert into anuncios values (2, 'Pago de Alex a Repsol','2021/04/19 13:00:00', '2021/04/10 20:00:00','54358695J');
insert into anuncios values (3, 'Pago de Diego a Citroen', '2021/04/19 00:00:00', '2021/04/13 04:00:00', '65781243H');

--TablaActualizacionesPrecios
insert into tablaactualizacionesprecios values ('Bitcoin',40000);
insert into tablaactualizacionesprecios values ('Ethereum',2000);
insert into tablaactualizacionesprecios values ('Dogecoin',10000);

--Monederos
insert into monederos values ('Diego','Bitcoin', 30);
insert into monederos values ('Alex','Bitcoin', 10);
insert into monederos values ('Alex','Ethereum', 10);
insert into monederos values ('Oscar','Ethereum', 20);
insert into monederos values ('Diego','Dogecoin', 10);

--compraventacriptos
insert into compraventacriptos values ('Diego','Alex','Bitcoin', '2021/04/21 12:00:00',3,40000);
insert into compraventacriptos values ('Alex','Oscar','Ethereum', '2021/04/15 16:00:00',1,2000);

--HacerOfertaVentaCripto
insert into hacerofertaventacripto values ('2021/04/14 20:00:00',1,'Ethereum', 'Oscar');
insert into hacerofertaventacripto values ('2021/04/14 20:00:00',3,'Bitcoin', 'Alex');


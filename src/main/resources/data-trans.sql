drop table if exists role CASCADE;

drop table if exists usuario CASCADE;

drop table if exists usuarios_roles CASCADE;

create table role (
    nome_role varchar(255) not null,
    primary key (nome_role)
);

 create table usuario (
    login varchar(255) not null,
    nome_completo varchar(255),
    senha varchar(255),
    primary key (login)
);

create table usuarios_roles (
     usuario_id varchar(255) not null,
     role_id varchar(255) not null
);

insert into usuario values ('user', 'nome_completo','$2a$10$KYvlIsSzDQvh.3C6JZ3.juegcZUjyQuAlnHuDfI78dYnEerxjIDZy');
insert into role values ('ROLE_USER');
insert into usuarios_roles values ('user','ROLE_USER');
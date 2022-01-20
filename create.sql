create table client (id varchar(255) not null, email varchar(255), password varchar(255), primary key (id));
create table good (id varchar(255) not null, description varchar(255), name varchar(255), price float8, producer varchar(255), primary key (id));
create table storage (id varchar(255) not null, location varchar(255), name varchar(255), primary key (id));
create table client (id varchar(255) not null, email varchar(255), password varchar(255), primary key (id));
create table good (id varchar(255) not null, description varchar(255), name varchar(255), price float8, producer varchar(255), primary key (id));
create table storage (id varchar(255) not null, location varchar(255), name varchar(255), primary key (id));

    create table clients (
       id varchar(255) not null,
        email varchar(255),
        password varchar(255),
        primary key (id)
    );

    create table goods (
       id varchar(255) not null,
        description varchar(255),
        name varchar(255),
        price float8,
        producer varchar(255),
        primary key (id)
    );

    create table orders (
       id varchar(255) not null,
        client_uuid uuid,
        status varchar(255),
        primary key (id)
    );

    create table storages (
       id varchar(255) not null,
        location varchar(255),
        name varchar(255),
        primary key (id)
    );

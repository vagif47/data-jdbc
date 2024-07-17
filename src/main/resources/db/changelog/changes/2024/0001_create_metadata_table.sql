--liquibase formatted sql
--changeset v.aliev:0001.1

CREATE SCHEMA IF NOT EXISTS doc;
create table doc.metadata(
    id bigserial primary key,
    storage_key varchar not null unique,
    file_name varchar not null unique,
    mdm_id varchar
);




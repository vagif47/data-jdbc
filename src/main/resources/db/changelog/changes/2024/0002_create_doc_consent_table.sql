--liquibase formatted sql
--changeset v.aliev:0002.1



create table doc.doc_consents(
     id bigserial primary key,
     consent_type varchar not null unique,
     signet_bank boolean not null,
     signet_mfk boolean not null,
     mdm_id varchar,
     metadata_id bigint not null,
     constraint doc_consent_fk foreign key (metadata_id) references doc.metadata(id) on delete cascade
);
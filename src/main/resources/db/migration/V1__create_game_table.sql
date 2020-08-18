CREATE TABLE game (
    id integer,
    name varchar,
    tags varchar[]
);

CREATE SEQUENCE game_id_seq;

ALTER TABLE game ADD CONSTRAINT game_pk primary key(id);

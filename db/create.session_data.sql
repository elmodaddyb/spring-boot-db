DROP TABLE IF EXISTS session_data;


CREATE TABLE session_data
(
ID SMALLINT UNSIGNED,
session_name VARCHAR(128),
data_file BLOB
);

INSERT INTO session_data VALUES (1,'abcdef1234','blahblahblah');
INSERT INTO session_data VALUES (2,'zzzaaaazzz','blahblahblah');
INSERT INTO session_data VALUES (3,'asdfasdf','blahblahblah');
INSERT INTO session_data VALUES (4,'fkfkfkfkf','blahblahblah');
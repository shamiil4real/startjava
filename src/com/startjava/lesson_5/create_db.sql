CREATE DATABASE mydb;

CREATE TABLE Jaegers (
    id SERIAL PRIMARY KEY,
    modelName TEXT,
    mark TEXT,
    height REAL,
    weight REAL,
    status TEXT,
    origin TEXT,
    launch DATE,
    kaijuKill INTEGER
);
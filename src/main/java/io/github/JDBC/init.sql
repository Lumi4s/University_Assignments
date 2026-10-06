CREATE TABLE brigade (
                         id_brigade SERIAL PRIMARY KEY,
                         name VARCHAR(100) NOT NULL
);

CREATE TABLE sample (
                        id_sample SERIAL PRIMARY KEY,
                        name VARCHAR(100) NOT NULL,
                        substance VARCHAR(100),
                        id_brigade INTEGER REFERENCES brigade(id_brigade)
);

INSERT INTO brigade (name)
VALUES
    ('Бригада №1'),
    ('Бригада №2');

INSERT INTO sample (name, substance, id_brigade)
VALUES
    ('Проба №1', 'Вода', 1),
    ('Проба №2', 'Почва', 1),
    ('Проба №3', 'Раствор соли', 2);
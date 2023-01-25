CREATE TABLE IF NOT EXISTS recipe (
    id INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    name varchar NOT NULL,
    preptime varchar NOT NULL,
    datecreated varchar NOT NULL,
    datemodified varchar NOT NULL,
    description varchar,
    authoruserid int REFERENCES appusers (id),
    cuisineid int REFERENCES cuisine (id),
    courseid int REFERENCES course (id)
);
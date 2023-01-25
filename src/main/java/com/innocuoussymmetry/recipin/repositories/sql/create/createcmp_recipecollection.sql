CREATE TABLE IF NOT EXISTS cmp_recipecollection (
    id INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    recipeid int REFERENCES recipe (id),
    collectionid int REFERENCES collection (id)
);
CREATE TABLE comments (
  comment_id SERIAL PRIMARY KEY,
  comment VARCHAR(500) NOT NULL,
  article_id INTEGER NOT NULL
);

CREATE TABLE comment_closure (
  ancestor INTEGER,
  descendant INTEGER,
  depth INTEGER DEFAULT 0,
  PRIMARY KEY(ancestor, descendant)
);

INSERT INTO comments(comment_id, comment, article_id)
VALUES
  (1, 'Comment 1', 1),
  (2, 'Comment 2', 1),
  (3, 'Comment 3', 1),
  (4, 'Comment 1.1', 1),
  (5, 'Comment 1.2', 1),
  (6, 'Comment 2.1', 1),
  (7, 'Comment 2.2', 1),
  (8, 'Comment 2.1.1', 1);

INSERT INTO comment_closure(ancestor, descendant, depth)
VALUES
  (1, 1, 0), (1, 4, 1), (1, 5, 1),
  (2, 2, 0), (2, 6, 1), (2, 7, 1), (2, 8, 2),
  (3, 3, 0),
  (4, 4, 0),
  (5, 5, 0),
  (6, 6, 0), (6, 8, 1),
  (7, 7, 0),
  (8, 8, 0);

CREATE TABLE comments (
  comment_id INTEGER PRIMARY KEY,
  path VARCHAR(1000) NOT NULL,
  comment VARCHAR(500) NOT NULL,
  article_id INTEGER NOT NULL
);

INSERT INTO comments(comment_id, path, comment, article_id)
VALUES
  (1, '1/', 'Comment 1', 1),
  (2, '2/', 'Comment 2', 1),
  (3, '3/', 'Comment 3', 1),
  (4, '1/4/', 'Comment 1.1', 1),
  (5, '1/5/', 'Comment 1.2', 1),
  (6, '2/6/', 'Comment 2.1', 1),
  (7, '2/7/', 'Comment 2.2', 1),
  (8, '2/6/8/', 'Comment 2.1.1', 1);

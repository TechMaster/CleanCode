CREATE TABLE comments (
  comment_id INTEGER PRIMARY KEY,
  lft INTEGER NOT NULL,
  rgt INTEGER NOT NULL,
  comment VARCHAR(500) NOT NULL,
  article_id INTEGER NOT NULL
);

INSERT INTO comments(comment_id, lft, rgt, comment, article_id)
VALUES
  (1, 1, 6, 'Comment 1', 1),
  (2, 7, 14, 'Comment 2', 1),
  (3, 15, 16, 'Comment 3', 1),
  (4, 2, 3, 'Comment 1.1', 1),
  (5, 4, 5, 'Comment 1.2', 1),
  (6, 8, 11, 'Comment 2.1', 1),
  (7, 12, 13, 'Comment 2.2', 1),
  (8, 9, 10, 'Comment 2.1.1', 1);

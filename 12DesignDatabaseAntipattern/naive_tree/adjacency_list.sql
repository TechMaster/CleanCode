CREATE TABLE comments (
  comment_id INTEGER PRIMARY KEY,
  parent_id INTEGER,
  comment VARCHAR(500),
  article_id INTEGER NOT NULL,
  FOREIGN KEY (parent_id) REFERENCES comments(comment_id) ON DELETE CASCADE
);

INSERT INTO comments(comment_id, parent_id, comment, article_id)
VALUES
  (1, NULL, 'Comment 1', 1),
  (2, NULL, 'Comment 2', 1),
  (3, NULL, 'Comment 3', 1),
  (4, 1, 'Comment 1.1', 1),
  (5, 1, 'Comment 1.2', 1),
  (6, 2, 'Comment 2.1', 1),
  (7, 2, 'Comment 2.2', 1),
  (8, 6, 'Comment 2.1.1', 1);

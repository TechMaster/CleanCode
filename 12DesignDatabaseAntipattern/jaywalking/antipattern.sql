CREATE TABLE articles (
  article_id INTEGER PRIMARY KEY,
  creator INTEGER,
  mentioned_users VARCHAR(500)
);

INSERT INTO articles(article_id, creator, mentioned_users)
VALUES
  (1, 1, '2,3,4'),
  (2, 2, '1,3'),
  (3, 3, '4');

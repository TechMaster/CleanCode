CREATE TABLE mentioned_users (
  article_id INTEGER,
  mentioned_user_id INTEGER,
  PRIMARY KEY (article_id, mentioned_user_id)
);

INSERT INTO mentioned_users(article_id, mentioned_user_id)
VALUES (1, 2), (1, 3), (1, 4);

INSERT INTO mentioned_users(article_id, mentioned_user_id)
VALUES (2, 1), (2, 3);

INSERT INTO mentioned_users(article_id, mentioned_user_id)
VALUES (3, 4);

CREATE TABLE article_tags (
  article_id INTEGER,
  tag VARCHAR(20),
  PRIMARY KEY (article_id, tag)
);

INSERT INTO article_tags(article_id, tag)
VALUES (1, 'hot-news'), (1, 'competition'), (1, 'award');

INSERT INTO article_tags(article_id, tag)
VALUES (2, 'meetup'), (2, 'technology');

INSERT INTO article_tags(article_id, tag)
VALUES (3, 'database');

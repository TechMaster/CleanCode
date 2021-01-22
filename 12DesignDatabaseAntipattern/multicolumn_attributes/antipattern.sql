CREATE TABLE articles (
  article_id INTEGER PRIMARY KEY,
  tag1 VARCHAR(20),
  tag2 VARCHAR(20),
  tag3 VARCHAR(20)
);

INSERT INTO articles(article_id, tag1, tag2, tag3)
VALUES
  (1, 'hot-news', 'competition', 'award'),
  (2, 'meetup', 'technology', NULL),
  (3, 'database', NULL, NULL);

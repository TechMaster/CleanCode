CREATE TABLE articles (
  article_id INTEGER PRIMARY KEY,
  content VARCHAR(1000) NOT NULL,
  creator INTEGER NOT NULL,
  created DATETIME NOT NULL,
  media VARCHAR(255)
);

CREATE TABLE surveys (
  survey_id INTEGER PRIMARY KEY,
  content VARCHAR(1000) NOT NULL,
  creator INTEGER NOT NULL,
  created DATETIME NOT NULL,
  deadline DATETIME
);

INSERT INTO articles(article_id, content, creator, created, media)
VALUES
  (1, 'This is an article', 1, '2020-12-20 10:00:00', 'http://example.com/xyz.jpg');

INSERT INTO surveys(survey_id, content, creator, created, deadline)
VALUES
  (1, 'This is a survey', 1, '2020-12-20 11:00:00', '2020-12-30 11:00:00');

CREATE TABLE contents (
  content_id INTEGER PRIMARY KEY,
  content VARCHAR(1000) NOT NULL,
  creator INTEGER NOT NULL,
  created DATETIME NOT NULL
);

CREATE TABLE articles (
  content_id INTEGER PRIMARY KEY,
  media VARCHAR(255)
);

CREATE TABLE surveys (
  content_id INTEGER PRIMARY KEY,
  deadline DATETIME
);

INSERT INTO contents(content_id, content, creator, created)
VALUES
  (1, 'This is an article', 1, '2020-12-20 10:00:00'),
  (2, 'This is a survey', 1, '2020-12-20 11:00:00');

INSERT INTO articles(content_id, media)
VALUES
  (1, 'http://example.com/xyz.jpg');

INSERT INTO surveys(content_id, deadline)
VALUES
  (2, '2020-12-30 11:00:00');

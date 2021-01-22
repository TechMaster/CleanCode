CREATE TABLE contents (
  content_id INTEGER PRIMARY KEY,
  content VARCHAR(1000) NOT NULL,
  creator INTEGER NOT NULL,
  created DATETIME NOT NULL,
  content_type CHAR(1) CHECK (content_type IN ('A', 'S')),
  media VARCHAR(255), -- only for articles
  deadline DATETIME -- only for surveys
);

INSERT INTO contents(content_id, content, creator, created, content_type, media, deadline)
VALUES
  (1, 'This is an article', 1, '2020-12-20 10:00:00', 'A', 'http://example.com/xyz.jpg', null),
  (2, 'This is a survey', 1, '2020-12-20 11:00:00', 'S', null, '2020-12-30 11:00:00');

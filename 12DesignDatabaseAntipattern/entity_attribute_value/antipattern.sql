CREATE TABLE contents (
  content_id INTEGER PRIMARY KEY
);

CREATE TABLE content_attributes (
  content_id INTEGER,
  attr_name VARCHAR(100),
  attr_value VARCHAR(1000),
  PRIMARY KEY (content_id, attr_name)
);

INSERT INTO contents(content_id) VALUES (1);

INSERT INTO content_attributes(content_id, attr_name, attr_value)
VALUES
  (1, 'content', 'This is an article'),
  (1, 'creator', '1'),
  (1, 'created', '2020-12-20 10:00:00'),
  (1, 'media', 'http://example.com/xyz.jpg');

INSERT INTO contents(content_id) VALUES (2);

INSERT INTO content_attributes(content_id, attr_name, attr_value)
VALUES
  (2, 'content', 'This is a survey'),
  (2, 'creator', '1'),
  (2, 'created', '2020-12-20 11:00:00'),
  (2, 'deadline', '2020-12-30 11:00:00');

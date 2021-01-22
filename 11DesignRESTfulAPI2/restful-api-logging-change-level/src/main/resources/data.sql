INSERT INTO users(id, name, email, password) VALUES
 (1, 'Alice', 'alice@gmail.com', '123456'),
 (2, 'Bob', 'bob@gmail.com', '123456');

INSERT INTO tasks(id, title, priority, user_id) VALUES
 (1, 'Play', 3, 1),
 (2, 'Sleep', 1, 1),
 (3, 'Learn', 1, 2),
 (4, 'Eat', 2, 1),
 (5, 'Travel', 2, 2);
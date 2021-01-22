CREATE TABLE users (
  user_id INTEGER PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  email VARCHAR(255) NOT NULL,
  password VARCHAR(255) NOT NULL
);

CREATE TABLE managers (
  user_id INTEGER PRIMARY KEY
  -- Manager information columns
);

CREATE TABLE staffs (
  user_id INTEGER PRIMARY KEY
  -- Staff information columns
);

CREATE TABLE management (
  manager_id INTEGER,
  user_id INTEGER,
  PRIMARY KEY (manager_id, user_id)
);

CREATE TABLE skills (
  user_id INTEGER,
  skill VARCHAR(20),
  PRIMARY KEY (user_id, skill)
);

CREATE TABLE departments (
  department_id INTEGER PRIMARY KEY,
  name VARCHAR(255) NOT NULL
);

CREATE TABLE department_closure (
  ancestor INTEGER,
  descendant INTEGER,
  depth INTEGER DEFAULT 0,
  PRIMARY KEY(ancestor, descendant)
);

--

INSERT INTO users(user_id, name, email, password)
VALUES
  (1, 'Manager A', 'manager.a@gmail.com', '123456'),
  (2, 'Manager B', 'manager.b@gmail.com', '123456'),
  (3, 'Staff C', 'staff.c@gmail.com', '123456'),
  (4, 'Staff D', 'staff.d@gmail.com', '123456'),
  (5, 'Staff E', 'staff.e@gmail.com', '123456');

INSERT INTO managers(user_id)
VALUES
  (1),
  (2);

INSERT INTO staffs(user_id)
VALUES
  (3),
  (4),
  (5);

INSERT INTO management(manager_id, user_id)
VALUES
  (1, 3),
  (1, 4),
  (2, 5);

INSERT INTO skills(user_id, skill)
VALUES
  (1, 'Project Manager'),
  (2, 'Team Leader'),
  (2, 'Java'),
  (3, 'JS'),
  (3, 'Java'),
  (4, 'Java'),
  (5, 'JS'),
  (5, 'C#');

INSERT INTO departments(department_id, name)
VALUES
  (1, 'Department 1'),
  (2, 'Department 2'),
  (3, 'Department 1.1'),
  (4, 'Department 1.2'),
  (5, 'Department 2.1'),
  (6, 'Department 1.1.1');

INSERT INTO department_closure(ancestor, descendant, depth)
VALUES
  (1, 1, 0),
  (1, 3, 1),
  (1, 4, 1),
  (1, 6, 2),
  (2, 2, 0),
  (2, 5, 1),
  (3, 3, 0),
  (3, 6, 1),
  (4, 4, 0),
  (5, 5, 0),
  (6, 6, 0);

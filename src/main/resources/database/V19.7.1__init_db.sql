CREATE TABLE user
(
    id    BIGINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    login VARCHAR(255) NOT NULL,
    name  VARCHAR(255) NOT NULL,
    age   INT          NOT NULL,
    role  VARCHAR(255)
);

CREATE TABLE section
(
    id           BIGINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    created_date BIGINT       NOT NULL,
    name         VARCHAR(255) NOT NULL,
    course_id    INT
);

-- ManyToOne
ALTER TABLE section
    ADD CONSTRAINT fk_section_id FOREIGN KEY (course_id) REFERENCES course (id);

CREATE TABLE lesson
(
    id           BIGINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    created_date BIGINT       NOT NULL,
    name         VARCHAR(255) NOT NULL,
    content      VARCHAR(255) NOT NULL
);

CREATE TABLE course
(
    id           BIGINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    created_date BIGINT       NOT NULL,
    name         VARCHAR(255) NOT NULL,
    cost         INT          NOT NULL
);

CREATE TABLE comment
(
    id           BIGINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    created_date BIGINT       NOT NULL,
    content      VARCHAR(255) NOT NULL,
    author_id    INT,
    lesson_id    INT
);

-- ManyToOne
ALTER TABLE comment
    ADD CONSTRAINT fk_comment_id FOREIGN KEY (lesson_id) REFERENCES lesson (id);

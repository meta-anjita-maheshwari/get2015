CREATE database LIS;
USE LIS;
CREATE TABLE members(
    member_id INT,
    member_nm VARCHAR(20),
    addressline1 VARCHAR(50),
    addressline2 VARCHAR(20),
    catagory VARCHAR(20),
    PRIMARY KEY (member_id)
);

CREATE TABLE books(
    accession_no INT,
    title_id INT,
    purchase_dt DATE,
    price DOUBLE,
    status CHAR,
    PRIMARY KEY (accession_no)
);

CREATE TABLE titles(
    title_id INT,
    title_nm VARCHAR(15),
    subject_id INT,
    publisher_id INT,
    PRIMARY KEY (title_id)
);

CREATE TABLE subjects(
    subject_id INT,
    subject_nm varchar(15),
    PRIMARY KEY (subject_id)
);

CREATE TABLE publisher(
    publisher_id INT,
    publisher_nm varchar(15),
    PRIMARY KEY (publisher_id)
);

CREATE TABLE authors(
    author_id INT,
    author_nm varchar(15),
    PRIMARY KEY (author_id)
);

CREATE TABLE book_issue(
    issue_dt DATE,
    accession_no INT,
    member_id INT,
    due_dt DATE,
    PRIMARY KEY (accession_no,issue_dt,member_id),
    FOREIGN KEY (accession_no) REFERENCES books (accession_no) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (member_id) REFERENCES members (member_id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE title_author(
    title_id INT,
    author_id INT,
    PRIMARY KEY (author_id,title_id),
    FOREIGN KEY (author_id) REFERENCES authors (author_id) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (title_id) REFERENCES titles (title_id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE book_return(
    return_dt DATE,
    accession_no INT,
    member_id INT,
    issue_dt DATE,
    PRIMARY KEY (return_dt,accession_no,member_id),
    FOREIGN KEY (accession_no) REFERENCES books (accession_no) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (member_id) REFERENCES members (member_id) ON DELETE CASCADE ON UPDATE CASCADE
);


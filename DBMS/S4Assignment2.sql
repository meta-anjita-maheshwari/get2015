/*Assignment 2 :- */
USE lis;

/*1. Create a View which can be used to display member name and all issue details of the member using a simple SELECT command*/
CREATE VIEW member_detail
AS
SELECT m.member_nm,bi.issue_dt, bi.accession_no, bi.member_id, bi.due_dt
FROM book_issue bi
INNER JOIN members m
ON m.member_id = bi.member_id;

SELECT * 
FROM member_detail;

/*2. Create a View which contains three columns, member name, member id and full description of category,
i.e., Faculty, Students and Others instead of F,S and O*/
CREATE VIEW member
AS
SELECT member_nm, member_id, IF(catagory = 'f','Faculty',IF(catagory = 's','Student',IF(catagory = 'o','Others',NULL))) AS category
FROM members;

SELECT * 
FROM member;

/*3. Create a View which contains the information – subject name, title, member name, category, issue date, due date and return date.
If the books have not been returned, NULL should be displayed instead of return date */
CREATE VIEW info_of_book
AS
SELECT s.subject_nm, t.title_nm, m.member_nm, m.catagory, bi.issue_dt, bi.due_dt, br.return_dt return_date
FROM members m

INNER JOIN book_issue bi
ON m.member_id = bi.member_id

LEFT JOIN book_return br
ON bi.member_id = br.member_id
AND bi.accession_no = br.accession_no

INNER JOIN books b
ON bi.accession_no = b.accession_no

INNER JOIN titles t
ON b.title_id = t.title_id

INNER JOIN subjects s
ON t.subject_id = s.subject_id;

SELECT * 
FROM info_of_book;
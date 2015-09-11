/*Assignment 1 :- */
use lis;

/*1. select member_nm, member_id, title_nm, accession_no, issue_dt, due_dt and month for which book is issued*/
SELECT m.member_nm, m.member_id, t.title_nm, b.accession_no, bi.issue_dt, bi.due_dt, DATEDIFF(br.return_dt,bi.issue_dt) AS Months
FROM members AS m
INNER JOIN book_issue bi
ON m.member_id = bi.member_id
INNER JOIN books b
ON b.accession_no = bi.accession_no
INNER JOIN book_return br
ON b.accession_no = br.accession_no
INNER JOIN titles t
ON t.title_id = b.title_id
WHERE DATEDIFF(br.return_dt,bi.issue_dt)>60
ORDER BY m.member_nm,t.title_nm;

/*2. Select member name and length of only member having maximum name length*/
SELECT member_nm,LENGTH(member_nm) max_length
FROM members
WHERE LENGTH(member_nm) = (SELECT MAX(LENGTH(member_nm))
FROM members);

/*3. select total number of books available*/
SELECT COUNT(accession_no) total_books
FROM books;

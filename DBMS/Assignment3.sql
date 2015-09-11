/*Assignment 3 :- */
use lis;

/*1. selects catagory name and number of members in that category*/
SELECT catagory,COUNT(catagory) no_of_members
FROM members
GROUP BY(catagory);

/*2. select title name and total number times the book is issued
displays only those titles issued more than once*/
SELECT t.title_nm,COUNT(bi.accession_no)
FROM titles t
INNER JOIN books b
ON b.title_id = t.title_id
INNER JOIN book_issue bi
ON bi.accession_no = b.accession_no
GROUP BY(t.title_nm)
HAVING COUNT(bi.accession_no)>=2;

/*3. Display information on books issued to members of catagory other than F*/
SELECT  m.member_nm, m.member_id, t.title_nm, bi.accession_no, s.subject_nm FROM book_issue bi
INNER JOIN  members m
ON bi.member_id = m.member_id AND m.catagory NOT IN("F")
INNER JOIN books b
ON b.accession_no = bi.accession_no
INNER JOIN titles t
ON b.title_id = t.title_id
INNER JOIN subjects s
ON s.subject_id = t.subject_id;

/*4. Display information on those authors for which at least one book has been status as "NOT_ISSUED":- 'n'*/
SELECT a.author_nm, ta.author_id, b.title_id FROM books b
INNER JOIN title_author ta
ON b.title_id = ta.title_id
INNER JOIN authors a
WHERE b.status = "n";

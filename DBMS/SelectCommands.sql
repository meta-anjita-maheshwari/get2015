/*Assignment 1 :- */
use lis;
/*SELECT command to display all the columns of members table*/
SELECT * from members;

/*SELECT command to display member_nm, member_id, catagory column of members table*/
SELECT member_nm, member_id, catagory
FROM members;

/*SELECT command to display member_nm, member_id, catagory column of members table where catagory='f'*/
SELECT member_nm, member_id, catagory
FROM members
WHERE catagory='f';

/*SELECT command to display various catagory of members*/
SELECT DISTINCT catagory
FROM members;

/*SELECT command to display member name and catagory in decreasing order of member name*/
SELECT member_nm,catagory
FROM members
ORDER BY member_nm DESC;

/*SELECT command to display title_nm, subject_nm and publisher_nm */
SELECT t.title_nm,s.subject_nm,p.publisher_nm
FROM titles t
INNER JOIN
subjects s
ON t.subject_id = s.subject_id
INNER JOIN
publisher p
ON t.publisher_id = p.publisher_id;

/*SELECT command to select catagory name and number of members in that catagory*/
SELECT catagory, COUNT(member_id) AS total
FROM members
GROUP BY catagory;

/*SELECT member name from members table when catagory of person is same as that of "pawan"*/
SELECT m1.member_nm
FROM members m1
INNER JOIN
members m2
ON m1.catagory = m2.catagory
WHERE m2.member_nm='pawan';

/*SELECT issue_date, accession_no, member_ID and return_date and if book is not returned then leave return_date column blank*/
SELECT bi.issue_dt issue_date,bi.accession_no accession_no,bi.member_id member_ID,IFNULL(br.return_dt,"") return_date
FROM book_issue bi
LEFT JOIN
book_return br
ON bi.accession_no = br.accession_no
AND bi.member_id = bR.member_id;

/*Assignment 2 :-
SELECT issue_date, accession_no, member_ID and return_date and if book is not returned then leave return_date column blank 
AND also sort the table according to issue date and then according to member name*/
SELECT bi.issue_dt issue_date,bi.accession_no accession_no,bi.member_id member_ID,IFNULL(br.return_dt,"") return_date, m1.member_nm Name
FROM book_issue bi
INNER JOIN 
members m1
ON bi.member_id = m1.member_id
LEFT JOIN
book_return br
ON bi.accession_no = br.accession_no
AND bi.member_id = bR.member_id
ORDER BY bi.issue_dt,m1.member_nm;



/*Assignment 2 :- */
use lis;

/*1. select subject name, subject id and number of books purchased*/
SELECT s.subject_id, s.subject_nm, COUNT(s.subject_id) AS TOTAL_BOOKS
from books b
inner join titles t
inner join subjects s
where((b.title_id = t.title_id) AND (t.subject_id = s.subject_id))
group by s.subject_id;

/*2. select book_issue information where difference of issue date and due date is more than 2 months*/
SELECT * FROM book_issue
WHERE (DATEDIFF(due_dt,issue_dt)>60);

/*3. select all the list of books except minimum rate book*/
SELECT t.title_nm book_name
FROM titles t
INNER JOIN books b
ON b.title_id = t.title_id
WHERE b.price > (SELECT MIN(price)
FROM books);
 

/*Assignment 1 :- */
USE lis;

/*1. SELECT command to display name of those members
who belong to the category as to which member “anjita” belongs*/
SELECT member_nm
FROM members
WHERE catagory = (SELECT catagory
FROM members
WHERE member_nm = 'anjita' );

/*2. SELECT command to display information on the books that have not been returned till date.
The information includes book issue date, title, member name and due date*/
SELECT bi.issue_dt,t.title_nm,m.member_nm,bi.due_dt
FROM book_issue bi,titles t,members m,books b
WHERE (bi.accession_no,bi.member_id, bi.issue_dt) 
NOT IN (SELECT accession_no, member_id, issue_dt 
FROM book_return) 
AND (bi.member_id=m.member_id) 
AND (bi.accession_no=b.accession_no) 
AND (b.title_id=t.title_id);

/*3. SELECT command to display information on the books that have been returned after their due dates. 
The information includes book issue date, title, member name and due date*/
SELECT m.member_id, m.member_nm, b.accession_no ,t.title_id ,t.title_nm ,bi.issue_dt ,bi.due_dt 
FROM members m,books b,titles t,book_issue bi
WHERE m.member_id = bi.member_id 
AND b.accession_no = bi.accession_no 
AND t.title_id = b.title_id 
AND (DATEDIFF( (SELECT br.return_dt 
FROM book_return br 
WHERE br.accession_no = bi.accession_no
AND bi.member_id = bi.member_id 
AND DATEDIFF(bi.issue_dt, br.issue_dt) = 0) ,bi.due_dt)>0);

/*4. Write a SELECT command to display information of those books
whose price is equal to the most expensive book purchase so far*/
SELECT * 
FROM books
WHERE price = (SELECT MAX(price)
FROM books);

/*5. Write a SELECT command to display the second maximum price of a book*/
SELECT * 
FROM books
WHERE price = (SELECT MAX(price)
FROM books 
WHERE price < (SELECT MAX(price) 
FROM books));
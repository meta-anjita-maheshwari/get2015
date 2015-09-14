USE LIS;
insert into members values(81,'anjita','ramnagar','ajmer','s');
insert into members values(82,'chetna','ramnaganj','jaipur','s');
insert into members values(83,'pawan','ramnagar','surat','f');
insert into members values(84,'ashish','nya bazar','kota','o');

insert into publisher values(1,'aashirwad');
insert into publisher values(2,'genius');
insert into publisher values(3,'tataMcHill');
insert into publisher values(4,'balaji');

insert into subjects values(61,'english');
insert into subjects values(62,'hindi');
insert into subjects values(63,'maths');
insert into subjects values(64,'science');

insert into titles values(41,'english',61,1);
insert into titles values(42,'hindi',62,2);
insert into titles values(43,'maths',63,3);
insert into titles values(44,'science',64,4);

insert into books values(21,41,'2014-03-19',180,'b');
insert into books values(22,42,'2014-07-15',125,'n');
insert into books values(23,43,'2014-01-19',150,'n');
insert into books values(24,44,'2014-10-08',180,'b');

insert into authors values(91,'krishna');
insert into authors values(92,'praveen');
insert into authors values(93,'rekha');
insert into authors values(94,'praduman');

insert into book_issue values('2015-01-03',21,81,'2015-01-21');
insert into book_issue values('2015-01-03',22,82,'2015-01-16');
insert into book_issue values('2015-01-15',23,83,'2015-01-30');
insert into book_issue values('2015-01-07',24,84,'2015-01-20');

insert into title_author values(41,91);
insert into title_author values(42,92);
insert into title_author values(43,93);
insert into title_author values(44,94);

insert into book_return values('2015-03-20',21,81,'2015-01-03');
insert into book_return values('2015-01-19',22,82,'2015-01-03');
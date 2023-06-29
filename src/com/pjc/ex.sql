--=== Schema ========================

create table student (
  sno int NOT NULL,
  sname char(8),
  primary key(sno)
);

create table enroll (
  sno int NOT NULL,
  cid char(4) NOT NULL,
  grade int,
  primary key(sno, cid)
);

insert into student (sno, sname) values (1, "1name");
insert into student (sno, sname) values (2, "2name");
insert into student (sno, sname) values (3, "3name");

insert into enroll (sno, cid, grade) values (1,"c001",70);
insert into enroll (sno, cid, grade) values (2,"c001",80);
insert into enroll (sno, cid, grade) values (3,"c001",90);

--=== SQL ========================
select *
from student s inner join enroll e
     on s.sno = e.sno
where e.grade >= 90
;
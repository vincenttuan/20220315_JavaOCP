# 20220315_JavaOCP
20220315_JavaOCP 認證課程

Collections Sort in Java 8
https://www.javatpoint.com/collections-sort-in-java-8

Java 8 Lambda : Comparator example
https://mkyong.com/java8/java-8-lambda-comparator-example/

Java 8 – How to sort list with stream.sorted()
https://mkyong.com/java8/java-8-how-to-sort-list-with-stream-sorted/

Java 8 – How to sort a Map
https://mkyong.com/java8/java-8-how-to-sort-a-map/

<pre>
建立部門資料表(dept)
    id   序號(主鍵) int
    name 部門名稱 varchar(20)
建立員工資料表(emp)
    id      序號(主鍵)     int
    name    員工姓名       varchar(20)
    salary  員工薪資       int
    dept_id 部門序號(外鍵)  int

create table dept(
    id int not null generated always as identity(start with 1, increment by 1),
    name varchar(20) not null,
    primary key(id)
);

create table emp(
    id int not null generated always as identity(start with 1, increment by 1),
    name varchar(20) not null,
    salary int,
    dept_id int not null,
    CONSTRAINT dept_id_ref FOREIGN KEY (dept_id) REFERENCES dept(id),
    primary key(id)
);

-- 新增 dept 資料
insert into dept(name) values('IT');
insert into dept(name) values('Sales');
insert into dept(name) values('Account');

-- 新增 emp 資料
insert into emp(name, salary, dept_id) values('John', 50000, 1);
insert into emp(name, salary, dept_id) values('Mary', 80000, 2);
insert into emp(name, salary, dept_id) values('Bob', 75000, 2);
insert into emp(name, salary, dept_id) values('Helen', 45000, 1);
insert into emp(name, salary, dept_id) values('Angle', 95000, 3);
insert into emp(name, salary, dept_id) values('Coco', 150000, 3);
insert into emp(name, salary, dept_id) values('Jack', 63000, 1);
insert into emp(name, salary, dept_id) values('Jo', 78000, 2);

-- 查詢指令
select * from dept;
select * from emp;

select dept.ID, dept."NAME" from dept;
select emp.ID, emp.DEPT_ID, emp."NAME", emp.SALARY from emp;

select d.ID, d."NAME" from dept d;  -- 設定 d 是 dept 的別名

-- 查詢條件 where
select * from emp where emp.SALARY >= 70000;
select * from emp where emp.SALARY >= 70000 and emp.SALARY <= 90000 ;
select * from emp where emp.SALARY between 70000 and 90000;
select * from emp where emp.DEPT_ID = 2;

-- 總薪資
select sum(emp.SALARY) as "total" from emp;

-- 各部門總薪資
select sum(emp.SALARY) as "total" from emp where emp.DEPT_ID = 1;
select sum(emp.SALARY) as "total" from emp where emp.DEPT_ID = 2;
select sum(emp.SALARY) as "total" from emp where emp.DEPT_ID = 3;

-- 各部門總薪資 group by
select emp.DEPT_ID, sum(emp.SALARY) as "total" 
from emp
group by emp.DEPT_ID           -- group by 群組
order by sum(emp.SALARY) desc  -- order by 排序 預設不寫就是 asc (由小->大), desc (由大->小)

-- 每一個部門名稱有哪些員工
select e.DEPT_ID, d."NAME", e."NAME"
from emp e, dept d
where e.DEPT_ID = d.ID;

select d."NAME" as "部門名稱", e."NAME" as "員工姓名"
from emp e, dept d
where e.DEPT_ID = d.ID
order by d."NAME" asc, e."NAME" desc

-- 最高薪資
select max(emp.SALARY) from emp;

-- 最低薪資
select min(emp.SALARY) from emp;

select emp."NAME", emp.SALARY
from emp
order by emp.SALARY desc 
fetch first 1 rows only;

-- 子查詢
select emp."NAME", emp.SALARY
from emp
where emp.SALARY = (select max(emp.SALARY) from emp);

-- 修改 
update emp 
set emp.salary = 12000, emp.dept_id = 1
where emp.ID = 1;

update emp 
set emp.salary = 12000, emp.dept_id = 1
where emp.ID in (1, 3);

-- 刪除
delete from emp
where emp.id = 5;
</pre>

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
)

-- 新增 dept 資料
insert into dept(name) values('IT');
insert into dept(name) values('Sales');
insert into dept(name) values('Account');


</pre>

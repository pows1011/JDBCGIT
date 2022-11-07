create table bank(
	accountNumber varchar2(50) primary key,
	accountName varchar2(40) not null,
	balance number not null
);
select * from bank;
drop table bank;
update bank set balance=(balance+1000) where accountName='백박사';
select sum(balance) from bank where accountName='백박사';
select avg(balance) from bank where accountName='백박사';


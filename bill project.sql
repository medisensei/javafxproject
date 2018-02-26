use bill;
create table products (productname varchar(30),price varchar(30),gain varchar(30),datepurchase varchar(30));

insert into products values('chemise','130','30','2018-02-24');
insert into products values('jacket','250','60','2018-02-24'),
						   ('jenz','170','40','2018-02-24'),
						   ('kappa','300','70','2018-02-24');

select * from products
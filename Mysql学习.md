# 1. Mysql操作学习
**Mysql**
- 查看数据库<br />
`show databases;`
- 创建数据库<br />
`create database database_name;`
- 选择数据库<br />
`use database_name;`
- 删除数据库<br />
`drop database database_name;`
- 查看数据库中的表<br />
`show tables;`
- 创建一个数据表<br />
`create table table_name;`<br />
eg:
`mysql> CREATE TABLE mytable (name VARCHAR(20), sex CHAR(1), 
-> birth DATE, birthaddr VARCHAR(20)); 
Query OK, 0 rows affected (0.00 sec)`
- 显示表结构<br />
`describe table_name;`
- 查看表中数据<br />
`select * from table_name;`
- 向表中添加数据<br />
`insert into table_name values('','',...);`
- 删除数据表<br />
`drop table table_name;`
- txt导入数据表<br />
`load data local infile "*/data.txt" into table table_name(*,...);`
- txt导出数据表<br />
`select *,... into outfile "*/data_out.txt" lines terminated by "\r\n" from table_name;`
- 修改数据表中数据
`update tablename set xx=xxx where xx(id=1)`
- 导出sql文件<br />
`mysqldump -u 用户名 -p databasename >exportfilename`
- 导入sql文件<br />
`create database database_name`
`use database name`
`source inportfilename`
# 2. 启动关闭mysql服务(命令行管理员)
开启<br />
`net start mysqlName`
关闭<br />
`net stop mysqlName`
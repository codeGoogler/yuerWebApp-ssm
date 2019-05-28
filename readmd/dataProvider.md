
### 创建数据表
```
create table student
(
 ID int auto_increment
  primary key,
 stuName varchar(32) null,
 stuAge tinyint null,
 mobile varchar(11) null,
 address varchar(256) null,
 EntranceTime date null
)
;

```


### 查询

```
select id,stuName, stuAge, mobile, address, EntranceTime from student
```


### 向表中发射数据

```
INSERT INTO student (stuName, stuAge, mobile, address, EntranceTime) VALUES ('何靖', 8, '110', '天府三街', '2017-06-06');
INSERT INTO student (stuName, stuAge, mobile, address, EntranceTime) VALUES ('小强', 18, '69776977', '中和镇', '2017-06-06');
INSERT INTO student (stuName, stuAge, mobile, address, EntranceTime) VALUES ('小迪', 22, '1456789', '天华苑', '2017-06-01');
INSERT INTO student (stuName, stuAge, mobile, address, EntranceTime) VALUES ('情歌', 24, '6454422', '成都', '2017-05-31');
INSERT INTO student (stuName, stuAge, mobile, address, EntranceTime) VALUES ('周三', 23, '1223154', '德阳', '2017-06-01');
INSERT INTO student (stuName, stuAge, mobile, address, EntranceTime) VALUES ('红牛', 32, '120', '黄山', '2017-05-31');
INSERT INTO student (stuName, stuAge, mobile, address, EntranceTime) VALUES ('大米', 16, '180', '新希望', '2017-06-04');
INSERT INTO student (stuName, stuAge, mobile, address, EntranceTime) VALUES ('小米', 22, '180', '贝立美', '2017-06-04');
INSERT INTO student (stuName, stuAge, mobile, address, EntranceTime) VALUES ('黑米', 36, '180', '新希望', '2017-06-04');
INSERT INTO student (stuName, stuAge, mobile, address, EntranceTime) VALUES ('红米', 24, '180', '一楼', '2017-06-04');
INSERT INTO student (stuName, stuAge, mobile, address, EntranceTime) VALUES ('大豆', 25, '180', '二流', '2017-06-04');
INSERT INTO student (stuName, stuAge, mobile, address, EntranceTime) VALUES ('绿豆', 26, '180', '三楼', '2017-06-04');
INSERT INTO student (stuName, stuAge, mobile, address, EntranceTime) VALUES ('灰豆', 19, '180', '四楼', '2017-06-04');
INSERT INTO student (stuName, stuAge, mobile, address, EntranceTime) VALUES ('欧阳修', 23, '122', '五棵松', '2017-05-28');
INSERT INTO student (stuName, stuAge, mobile, address, EntranceTime) VALUES ('韩明', 12, '120', '鸟巢', '2017-05-29');
INSERT INTO student (stuName, stuAge, mobile, address, EntranceTime) VALUES ('李修', 21, '120', '长安', '2017-06-14');
INSERT INTO student (stuName, stuAge, mobile, address, EntranceTime) VALUES ('韩梅梅', 12, '2132354354', '大坪', '2017-06-01');
INSERT INTO student (stuName, stuAge, mobile, address, EntranceTime) VALUES ('东北F4', 99, '121313121', '铁岭', '2017-06-01');
INSERT INTO student (stuName, stuAge, mobile, address, EntranceTime) VALUES ('赵四', 32, '44111221', '东北', '2017-06-07');
```

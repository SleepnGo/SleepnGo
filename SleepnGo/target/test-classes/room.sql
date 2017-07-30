insert into member(id,password,name,birth,phoneno,address,email,businessno) 
values ('java','1234','김자바','901015',112,'주암동','자바닷컴',1);


/*ID VARCHAR2(50) PRIMARY KEY,
    PASSWORD VARCHAR2(50) NOT NULL,
    NAME VARCHAR2(100) NOT NULL,
    BIRTH VARCHAR2(20) NOT NULL,
    PHONENO NUMBER NOT NULL,
    ADDRESS VARCHAR2(200) NOT NULL,
    EMAIL VARCHAR2(100) NOT NULL,
    BUSINESSNO NUMBER DEFAULT 0*/

insert into ROOM values(seq_roomno.nextval,'java',100,'?',10,10,4,1,1,1,'좋습니다','자바네');
insert into ROOM values(seq_roomno.nextval,'java',300,'?',10,10,4,1,1,1,'어서오세요','자바집');

select * from room

insert into REVIEW values(SEQ_REVIEWNO.nextval,1,'java','ㅎㅎㅎㅎ',5,sysdate);

select * from REVIEW

select roomno, count(*) review_count from review group by roomno order by review_count desc;

select roomNo, count(*) reviewCount from review group by roomno order by reviewCount desc
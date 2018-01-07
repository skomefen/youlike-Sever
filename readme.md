### youlike-server

### datebase init
```
    create database youlike;
     use youlike;
     create table music(
        id varchar(40) primary key,
        name varchar(100) not null,
        url varchar(225) not null
    );
    insert into music(id,name,url) values(1,'Audrey Hepburn - Moon River.mp3','music/1.mp3');
    insert into music(id,name,url) values(2,'BROODS - Sleep, Baby, Sleep.mp3','music/2.mp3');
    insert into music(id,name,url) values(3,'Marble Sounds - Ship In The%20Sand.mp3','music/3.mp3')
```


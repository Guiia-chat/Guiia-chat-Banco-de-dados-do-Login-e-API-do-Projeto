use login_chat_guiia;
drop table users;
Create table users(
user_id int auto_increment primary key,
name varchar(50),
password varchar(50)
);
select * from users;
drop table users;
insert into users(name,password)value("kiko","123");